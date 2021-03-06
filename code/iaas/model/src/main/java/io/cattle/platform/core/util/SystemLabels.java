package io.cattle.platform.core.util;

public class SystemLabels {
    public static final String LABEL_AGENT_CREATE = "io.rancher.container.create_agent";
    public static final String LABEL_AGENT_ROLE = "io.rancher.container.agent.role";
    public static final String LABEL_USE_RANCHER_DNS = "io.rancher.container.dns";
    public static final String LABEL_REQUESTED_IP = "io.rancher.container.requested_ip";
    public static final String LABEL_AGENT_URI_PREFIX = "io.rancher.container.agent.uri.prefix";

    /**
     * Indicates an instance runs an agent that provides the labels provider service
     */
    public static final String LABEL_AGENT_SERVICE_LABELS_PROVIDER = "io.rancher.container.agent_service.labels_provider";

    public static final String LABEL_VM = "io.rancher.vm";
    public static final String LABEL_VM_USERDATA = "io.rancher.vm.userdata";
    public static final String LABEL_VM_METADATA = "io.rancher.vm.metadata";
    public static final String LABEL_VM_OS_METADATA = "io.rancher.vm.os_metadata";
    public static final String LABEL_VM_MEMORY = "io.rancher.vm.memory";
    public static final String LABEL_VM_VCPU = "io.rancher.vm.vcpu";

    // TODO - move "rancher.io" labels from other parts of the code, here
}
