package flyweight.website;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 23:12
 */
public class WebsiteFactory {
    private Map<String, Website> flyweights = new HashMap<>();

    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return flyweights.get(key);
    }

    public int getWebsiteCount() {
        return flyweights.size();
    }
}
