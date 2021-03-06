package io.cattle.platform.iaas.api.filter.ssl;

import io.cattle.platform.core.model.Certificate;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.iaas.api.filter.common.AbstractDefaultResourceManagerFilter;
import io.cattle.platform.object.util.DataUtils;
import io.cattle.platform.ssh.common.SslCertificateUtils;
import io.github.ibuildthecloud.gdapi.exception.ClientVisibleException;
import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.request.resource.ResourceManager;
import io.github.ibuildthecloud.gdapi.util.ResponseCodes;
import io.github.ibuildthecloud.gdapi.validation.ValidationErrorCodes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CertificateCreateValidationFilter extends AbstractDefaultResourceManagerFilter {
    private static final Log logger = LogFactory.getLog(CertificateCreateValidationFilter.class);

    @Override
    public String[] getTypes() {
        return new String[] { "certificate" };
    }

    @Override
    public Class<?>[] getTypeClasses() {
        return new Class<?>[] { Instance.class };
    }

    @Override
    public Object create(String type, ApiRequest request, ResourceManager next) {
        String cert = DataUtils.getFieldFromRequest(request, "cert", String.class);

        // set extra fields
        Certificate certificate = request.proxyRequestObject(Certificate.class);

        try {
            DataUtils.getWritableFields(certificate).put("certFingerprint",
                    SslCertificateUtils.getCertificateFingerprint(cert));
            DataUtils.getWritableFields(certificate).put("expiresAt",
                    SslCertificateUtils.getExpirationDate(cert));
            DataUtils.getWritableFields(certificate).put("CN",
                    SslCertificateUtils.getCN(cert));
            DataUtils.getWritableFields(certificate).put("issuer",
                    SslCertificateUtils.getIssuer(cert));
            DataUtils.getWritableFields(certificate).put("issuedAt",
                    SslCertificateUtils.getIssuedDate(cert));
            DataUtils.getWritableFields(certificate).put("version",
                    SslCertificateUtils.getVersion(cert));
            DataUtils.getWritableFields(certificate).put("algorithm",
                    SslCertificateUtils.getAlgorithm(cert));
            DataUtils.getWritableFields(certificate).put("serialNumber",
                    SslCertificateUtils.getSerialNumber(cert));
            DataUtils.getWritableFields(certificate).put("keySize",
                    SslCertificateUtils.getKeySize(cert));
            DataUtils.getWritableFields(certificate).put("subjectAlternativeNames",
                    SslCertificateUtils.getSubjectAlternativeNames(cert));
        } catch (Exception e) {
            logger.error("Exception parsing certificate fields ", e);
            throw new ClientVisibleException(ResponseCodes.UNPROCESSABLE_ENTITY, ValidationErrorCodes.INVALID_FORMAT,
                    e.getMessage(), null);
        }

        return super.create(type, request, next);
    }
}
