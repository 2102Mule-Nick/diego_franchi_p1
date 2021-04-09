
package com.revature.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for guild complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="guild"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="guildId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="guildLeader" type="{http://ws.revature.com/}player" minOccurs="0"/&gt;
 *         &lt;element name="guildMembers" type="{http://ws.revature.com/}player" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="guildName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guildOfficers" type="{http://ws.revature.com/}player" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guild", propOrder = {
    "guildId",
    "guildLeader",
    "guildMembers",
    "guildName",
    "guildOfficers"
})
public class Guild {

    protected int guildId;
    protected Player guildLeader;
    @XmlElement(nillable = true)
    protected List<Player> guildMembers;
    protected String guildName;
    @XmlElement(nillable = true)
    protected List<Player> guildOfficers;

    /**
     * Gets the value of the guildId property.
     * 
     */
    public int getGuildId() {
        return guildId;
    }

    /**
     * Sets the value of the guildId property.
     * 
     */
    public void setGuildId(int value) {
        this.guildId = value;
    }

    /**
     * Gets the value of the guildLeader property.
     * 
     * @return
     *     possible object is
     *     {@link Player }
     *     
     */
    public Player getGuildLeader() {
        return guildLeader;
    }

    /**
     * Sets the value of the guildLeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link Player }
     *     
     */
    public void setGuildLeader(Player value) {
        this.guildLeader = value;
    }

    /**
     * Gets the value of the guildMembers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guildMembers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuildMembers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Player }
     * 
     * 
     */
    public List<Player> getGuildMembers() {
        if (guildMembers == null) {
            guildMembers = new ArrayList<Player>();
        }
        return this.guildMembers;
    }

    /**
     * Gets the value of the guildName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuildName() {
        return guildName;
    }

    /**
     * Sets the value of the guildName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuildName(String value) {
        this.guildName = value;
    }

    /**
     * Gets the value of the guildOfficers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guildOfficers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuildOfficers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Player }
     * 
     * 
     */
    public List<Player> getGuildOfficers() {
        if (guildOfficers == null) {
            guildOfficers = new ArrayList<Player>();
        }
        return this.guildOfficers;
    }

}
