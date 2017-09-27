package flyweight.website;

import java.util.Hashtable;

/**
 * Description:
 *
 * @Author: dong
 * @Date: 2017-09-27
 * @Time: 23:12
 */
public class WebsiteFactory {
    private Hashtable flyweights = new Hashtable();

    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return (Website) flyweights.get(key);
    }

    public int getWebsiteCount() {
        return flyweights.size();
    }
}
