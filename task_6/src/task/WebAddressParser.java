package task;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.HashMap;

public class WebAddressParser {
    private URL address;

    public WebAddressParser(String address) {
        try {
            this.address = new URL(address);
        } catch (MalformedURLException e) {
            this.address = null;
        }
    }

    public boolean isValid() {
        return address != null;
    }

    public String getScheme() {
        if (isValid()) {
            return address.getProtocol();
        } else {
            return "";
        }
    }

    public String getLogin() {
        if (isValid()) {
            String[] auth = address.getAuthority().split("@");
            if (auth.length >= 2) {
                String[] log = auth[0].split(":");
                if (log.length >= 2) {
                    return log[0];
                }
            }
        }
        return "";
    }

    public String getPassword() {
        if (isValid()) {
            String[] auth = address.getAuthority().split("@");
            if (auth.length >= 2) {
                String[] log = auth[0].split(":");
                if (log.length >= 2) {
                    return log[1];
                }
            }
        }
        return "";
    }

    public String getHost() {
        if (isValid()) {
            return address.getHost();
        } else {
            return "";
        }
    }

    public String getPort() {
        if (isValid() && address.getPort() != -1) {
            return Integer.toString(address.getPort());
        } else {
            return "";
        }
    }

    public String getUrl() {
        if (isValid()) {
            return address.getPath().replaceFirst("/", "");
        } else {
            return "";
        }
    }

    public HashMap<String, String> getParameters() {
        HashMap<String, String> parameters = new HashMap<>();
        if (isValid() && address.getQuery() != null) {
            String[] prmtrs = address.getQuery().split("&");
            String pr[];
            for (int i = 0; i < prmtrs.length; i++) {
                pr = prmtrs[i].split("=");
                parameters.put(pr[0], pr[1]);
            }
        }
        return parameters;
    }

    public String getFragment() {
        if (isValid() && address.getRef() != null) {
            return address.getRef();
        } else {
            return "";
        }
    }
}


