package com.ctrlflow.aer.client.dto;

import java.util.Arrays;

/**
 * @since 2.0.0
 */
public class Status {
    private static final Status[] EMPTY = new Status[0];

    private String pluginId;
    private String pluginVersion;
    private int code;
    private int severity;
    private String message;
    private String fingerprint;
    private Throwable exception;
    private Status[] children = EMPTY;

    public Status[] getChildren() {
        return children;
    }

    public Status getChild(int index) {
        return children[index];
    }

    public int getCode() {
        return code;
    }

    public Throwable getException() {
        return exception;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public String getMessage() {
        return message;
    }

    public String getPluginId() {
        return pluginId;
    }

    public String getPluginVersion() {
        return pluginVersion;
    }

    public int getSeverity() {
        return severity;
    }

    public void setChildren(Status[] children) {
        this.children = children;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setException(Throwable exception) {
        this.exception = exception;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public boolean hasException() {
        return exception != null;
    }

    public boolean hasChildren() {
        return children != null && children.length > 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(children);
        result = prime * result + code;
        result = prime * result + (exception == null ? 0 : exception.hashCode());
        result = prime * result + (fingerprint == null ? 0 : fingerprint.hashCode());
        result = prime * result + (message == null ? 0 : message.hashCode());
        result = prime * result + (pluginId == null ? 0 : pluginId.hashCode());
        result = prime * result + (pluginVersion == null ? 0 : pluginVersion.hashCode());
        result = prime * result + severity;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Status other = (Status) obj;
        if (!Arrays.equals(children, other.children)) {
            return false;
        }
        if (code != other.code) {
            return false;
        }
        if (exception == null) {
            if (other.exception != null) {
                return false;
            }
        } else if (!exception.equals(other.exception)) {
            return false;
        }
        if (fingerprint == null) {
            if (other.fingerprint != null) {
                return false;
            }
        } else if (!fingerprint.equals(other.fingerprint)) {
            return false;
        }
        if (message == null) {
            if (other.message != null) {
                return false;
            }
        } else if (!message.equals(other.message)) {
            return false;
        }
        if (pluginId == null) {
            if (other.pluginId != null) {
                return false;
            }
        } else if (!pluginId.equals(other.pluginId)) {
            return false;
        }
        if (pluginVersion == null) {
            if (other.pluginVersion != null) {
                return false;
            }
        } else if (!pluginVersion.equals(other.pluginVersion)) {
            return false;
        }
        if (severity != other.severity) {
            return false;
        }
        return true;
    }
}
