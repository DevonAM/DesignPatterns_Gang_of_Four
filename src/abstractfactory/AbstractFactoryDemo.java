package abstractfactory;


/**
 * This example demonstrates the abstract factory design pattern.
 * Is a group of similar factories, Complex, heavily abstracted.
 * 	Written as a framework pattern.
 * Pitfalls: The most complex of creational, runtime switch,
 * 	pattern within a pattern. Starts as a factory
 * VS factory. Factory returns various instances. Multiple constructors,
 * 	interface driven, adaptable to environment more easily.
 * Abstract Factory: Implemented with a factory, hides factory, abstracts
 * 	environment, built through composition.
 */
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = CreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
	}

}
