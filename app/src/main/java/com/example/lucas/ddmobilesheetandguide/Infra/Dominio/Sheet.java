package com.example.lucas.ddmobilesheetandguide.Infra.Dominio;

import com.example.lucas.ddmobilesheetandguide.Infra.IClasse;
import com.example.lucas.ddmobilesheetandguide.Infra.IFeat;
import com.example.lucas.ddmobilesheetandguide.Infra.IItem;
import com.example.lucas.ddmobilesheetandguide.Infra.ISheet;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Lucas on 09/09/2014.
 */
public class Sheet implements ISheet {

    private String EDITION;

    private String name;
    private String race;
    private IClasse classe;
    private String gender;
    private int age;
    private String size;
    private String movement;
    private String tendency;
    private String divinity;

    private int hp;         // Hit Points ; Pontos de Vida
    private int mp;         // Magic Points ; Pontos de Magia (Mana)

    private int iniciative; // Iniciativa

    // Abilities ; Habilidades

    private int str;
    private int dex;
    private int cons;
    private int intel;
    private int know;
    private int car;

    // Resistances ; Resistências

    private int fortitude;
    private int reflex;
    private int will;
    private int armorClass;

    // Common Skills ; Perícias em Comum

    private int perception; // Percepçao
    private int intimidate; // Intimidação
    private int insight;    // Intuição
    private int atletism;   // Atletismo
    private int thievery;   // Ladinagem
    private int firstAid;   // Cura ou Socorro
    private int survival;   // Sobrevivencia

    // Feats ; Talentos

    private ArrayList<IFeat> Feats = new ArrayList<IFeat>();

    // Equipments

    private ArrayList<IItem> Inventory = new ArrayList<IItem>();
    private int maxLoad;
    private int totalLoad;
    private int gp;     // Gold Pieces ; Peças de Ouro
    private int pp;     // Platinum Pieces ; Peças de Platina
    private int sp;     // Silver Pieces ; Peças de Prata
    private int cp;     // Cooper Pieces ; Peças de Bronze

    public String getEDITION() {
        return EDITION;
    }

    public void setEDITION(String EDITION) {
        this.EDITION = EDITION;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public IClasse getClasse() {
        return classe;
    }

    public void setClasse(IClasse classe) {
        this.classe = classe;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getTendency() {
        return tendency;
    }

    public void setTendency(String tendency) {
        this.tendency = tendency;
    }

    public String getDivinity() {
        return divinity;
    }

    public void setDivinity(String divinity) {
        this.divinity = divinity;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getIniciative() {
        return iniciative;
    }

    public void setIniciative(int iniciative) {
        this.iniciative = iniciative;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getStrMod(){
        return calculateMod(this.str);
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getKnow() {
        return know;
    }

    public void setKnow(int know) {
        this.know = know;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }

    public int getFortitude() {
        return fortitude;
    }

    public void setFortitude(int fortitude) {
        this.fortitude = fortitude;
    }

    public int getReflex() {
        return reflex;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public int getWill() {
        return will;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getIntimidate() {
        return intimidate;
    }

    public void setIntimidate(int intimidate) {
        this.intimidate = intimidate;
    }

    public int getInsight() {
        return insight;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public int getAtletism() {
        return atletism;
    }

    public void setAtletism(int atletism) {
        this.atletism = atletism;
    }

    public int getThievery() {
        return thievery;
    }

    public void setThievery(int thievery) {
        this.thievery = thievery;
    }

    public int getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(int firstAid) {
        this.firstAid = firstAid;
    }

    public int getSurvival() {
        return survival;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public ArrayList<IFeat> getFeats() {
        return Feats;
    }

    public void setFeats(ArrayList<IFeat> feats) {
        Feats = feats;
    }

    public ArrayList<IItem> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<IItem> inventory) {
        Inventory = inventory;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getTotalLoad() {
        return totalLoad;
    }

    public void setTotalLoad(int totalLoad) {
        this.totalLoad = totalLoad;
    }

    public int getGp() {
        return gp;
    }

    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getSp() {
        return sp;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    /**
     * Calculates the Modifier for the given Ability.
     * @param ab Ability
     * @return The calculated modifier
     */
    private int calculateMod(int ab){
        float bruteAb = ab-10;
        BigDecimal mod = new BigDecimal(Float.toString(bruteAb));
        BigDecimal two = new BigDecimal("2.0");
        mod = mod.divide(two, BigDecimal.ROUND_FLOOR);
        int modifier = Integer.parseInt(mod.toString());
        return modifier;
    }

    public void update(){}

}

