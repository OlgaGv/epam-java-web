//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.18 at 04:28:21 AM MSK 
//


package com.bsu.xmlparsing.jaxbentity;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.cards package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrdinaryCard_QNAME = new QName("http://www.example.com/cards", "OrdinaryCard");
    private final static QName _OldCards_QNAME = new QName("http://www.example.com/cards", "OldCards");
    private final static QName _Card_QNAME = new QName("http://www.example.com/cards", "Card");
    private final static QName _GreetingCard_QNAME = new QName("http://www.example.com/cards", "GreetingCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.cards
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GreetingCardType }
     * 
     */
    public GreetingCardType createGreetingCardType() {
        return new GreetingCardType();
    }

    /**
     * Create an instance of {@link OrdinaryCardType }
     * 
     */
    public OrdinaryCardType createOrdinaryCardType() {
        return new OrdinaryCardType();
    }

    /**
     * Create an instance of {@link OldCardsType }
     * 
     */
    public OldCardsType createOldCardsType() {
        return new OldCardsType();
    }

    /**
     * Create an instance of {@link CardType }
     * 
     */
    public CardType createCardType() {
        return new CardType();
    }

    /**
     * Create an instance of {@link HistoryType }
     * 
     */
    public HistoryType createHistoryType() {
        return new HistoryType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinaryCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/cards", name = "OrdinaryCard")
    public JAXBElement<OrdinaryCardType> createOrdinaryCard(OrdinaryCardType value) {
        return new JAXBElement<OrdinaryCardType>(_OrdinaryCard_QNAME, OrdinaryCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OldCardsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/cards", name = "OldCards")
    public JAXBElement<OldCardsType> createOldCards(OldCardsType value) {
        return new JAXBElement<OldCardsType>(_OldCards_QNAME, OldCardsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/cards", name = "Card")
    public JAXBElement<CardType> createCard(CardType value) {
        return new JAXBElement<CardType>(_Card_QNAME, CardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GreetingCardType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.com/cards", name = "GreetingCard")
    public JAXBElement<GreetingCardType> createGreetingCard(GreetingCardType value) {
        return new JAXBElement<GreetingCardType>(_GreetingCard_QNAME, GreetingCardType.class, null, value);
    }

}
