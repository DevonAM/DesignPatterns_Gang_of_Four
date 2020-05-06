package factory;

/**
 * Demonstrates the factory pattern.
 * Complex, Creation in sublclass, not refactored into, usually implemented from start.
 * Vs singleton
 * Singleton returns same instance, one constructor no args no interface, no subclasses.
 * Factory returns various instances has multiple constructors. Interface/contract driven. Subclasses involved
 *      Adaptable to environment more easily.
 * Parameter driven, Solves complex creation , complex, opposite of singleton.
 * @author Devon Acree-Meza
 */
public class FactoryDemo {

    public static void main(String[] args){
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());

    }
}
