package com.mergebase.jenkins;

public class MergebaseConfig {
    private String domain;
    private String customerToken;
    private String projectName;
    private String severityThreshold;
    private boolean enableScanAll;
    private boolean enableDebugMode;
    private boolean enableJsonOutput;
    private String scanPath;

    public MergebaseConfig(){}

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCustomerToken() {
        return customerToken;
    }

    public void setCustomerToken(String customerToken) {
        this.customerToken = customerToken;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getSeverityThreshold() {
        return severityThreshold;
    }

    public void setSeverityThreshold(String severityThreshold) {
        this.severityThreshold = severityThreshold;
    }

    public boolean isEnableScanAll() {
        return enableScanAll;
    }

    public void setEnableScanAll(boolean enableScanAll) {
        this.enableScanAll = enableScanAll;
    }

    public boolean isEnableDebugMode() {
        return enableDebugMode;
    }

    public void setEnableDebugMode(boolean enableDebugMode) {
        this.enableDebugMode = enableDebugMode;
    }

    public boolean isEnableJsonOutput() {
        return enableJsonOutput;
    }

    public void setEnableJsonOutput(boolean enableJsonOutput) {
        this.enableJsonOutput = enableJsonOutput;
    }

    public String getScanPath() {
        return scanPath;
    }

    public void setScanPath(String scanPath) {
        this.scanPath = scanPath;
    }
}
