
package com.revature.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for player complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="player"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classSpecialization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="guildRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playerClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playerFaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playerGuild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="playerLevel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="playerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playerProfession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="playerRace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "player", propOrder = {
    "classSpecialization",
    "guildRole",
    "playerClass",
    "playerFaction",
    "playerGuild",
    "playerId",
    "playerLevel",
    "playerName",
    "playerProfession",
    "playerRace"
})
public class Player {

    protected String classSpecialization;
    protected String guildRole;
    protected String playerClass;
    protected String playerFaction;
    protected String playerGuild;
    protected int playerId;
    protected int playerLevel;
    protected String playerName;
    protected String playerProfession;
    protected String playerRace;

    /**
     * Gets the value of the classSpecialization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassSpecialization() {
        return classSpecialization;
    }

    /**
     * Sets the value of the classSpecialization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassSpecialization(String value) {
        this.classSpecialization = value;
    }

    /**
     * Gets the value of the guildRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuildRole() {
        return guildRole;
    }

    /**
     * Sets the value of the guildRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuildRole(String value) {
        this.guildRole = value;
    }

    /**
     * Gets the value of the playerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     * Sets the value of the playerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerClass(String value) {
        this.playerClass = value;
    }

    /**
     * Gets the value of the playerFaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerFaction() {
        return playerFaction;
    }

    /**
     * Sets the value of the playerFaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerFaction(String value) {
        this.playerFaction = value;
    }

    /**
     * Gets the value of the playerGuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerGuild() {
        return playerGuild;
    }

    /**
     * Sets the value of the playerGuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerGuild(String value) {
        this.playerGuild = value;
    }

    /**
     * Gets the value of the playerId property.
     * 
     */
    public int getPlayerId() {
        return playerId;
    }

    /**
     * Sets the value of the playerId property.
     * 
     */
    public void setPlayerId(int value) {
        this.playerId = value;
    }

    /**
     * Gets the value of the playerLevel property.
     * 
     */
    public int getPlayerLevel() {
        return playerLevel;
    }

    /**
     * Sets the value of the playerLevel property.
     * 
     */
    public void setPlayerLevel(int value) {
        this.playerLevel = value;
    }

    /**
     * Gets the value of the playerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Sets the value of the playerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerName(String value) {
        this.playerName = value;
    }

    /**
     * Gets the value of the playerProfession property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerProfession() {
        return playerProfession;
    }

    /**
     * Sets the value of the playerProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerProfession(String value) {
        this.playerProfession = value;
    }

    /**
     * Gets the value of the playerRace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlayerRace() {
        return playerRace;
    }

    /**
     * Sets the value of the playerRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlayerRace(String value) {
        this.playerRace = value;
    }

}
