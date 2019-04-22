class Entity {
    //generic
    private String name;
    private double healthMax,health;
    private Item[]  items = new Item[8];
    final private String[] itemSlotNames = {"Helmet","Chestplate","Sleeves","Pants","Boots","Gloves","Primary","Secondary"}; //equal in size to items
    //physical
    private double damagePhysical,resistancePhysical,staminaMax,stamina,staminaRegen;
    //magical
    private double damageMagical,resistanceMagical,manaMax,mana,manaRegen;

    //generic-----------------------------------------------------------------------------------------------------------
    /**
     * sets the name
     * @param name This is copied exactly.
     */
    void setName(String name){
            this.name = name;
    }
    String getName(){
        return name;
    }

    /**
     * sets maximum health
     * @param health 1-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setHealthMax(double health){
        if(health>=1&&health<=Double.MAX_VALUE){
            healthMax = health;
        }else if(health<1){
            healthMax = 1;
        }else{
            healthMax = Double.MAX_VALUE;
        }
    }
    double getHealthMax(){
        return healthMax;
    }

    /**
     * sets current health
     * @param health 0-healthMax inclusive, will default to bounds if outside of these values.
     */
    void setHealth(double health){
        if(health>=0&&health<=healthMax){
            this.health = health;
        }else if(health<0){
            this.health = 0;
        }else{
            this.health = healthMax;
        }
    }
    double getHealth(){
        return health;
    }

    //physical----------------------------------------------------------------------------------------------------------
    /**
     * sets physical damage
     * @param damage 0-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setDamagePhysical(double damage){
        if(damage>=0&&damage<=Double.MAX_VALUE){
            damagePhysical = damage;
        }else if(damage<0){
            damagePhysical = 0;
        }else{
            damagePhysical = Double.MAX_VALUE;
        }
    }
    double getDamagePhysical(){
        return damagePhysical;
    }

    /**
     * sets physical resistance
     * @param resistance Double.MIN_VALUE-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setResistancePhysical(double resistance){
        if(resistance>=Double.MIN_VALUE&&resistance<=Double.MAX_VALUE){
            resistancePhysical = resistance;
        }else if(resistance<Double.MIN_VALUE){
            resistancePhysical = Double.MIN_VALUE;
        }else{
            resistancePhysical = Double.MAX_VALUE;
        }
    }
    double getResistancePhysical(){
        return resistancePhysical;
    }

    /**
     * sets maximum stamina
     * @param stamina 0-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setStaminaMax(double stamina){
        if(stamina>=0&&stamina<=Double.MAX_VALUE){
            staminaMax = stamina;
        }else if(stamina<0){
            staminaMax = 0;
        }else{
            staminaMax = Double.MAX_VALUE;
        }
    }
    double getStaminaMax(){
        return staminaMax;
    }

    /**
     * sets current stamina
     * @param stamina 0-staminaMax inclusive, will default to bounds if outside of these values.
     */
    void setStamina(double stamina){
        if(stamina>=0&&stamina<=this.staminaMax){
            this.staminaMax = stamina;
        }else if(stamina<0){
            this.stamina = 0;
        }else{
            this.stamina = this.staminaMax;
        }
    }
    double getStamina(){
        return stamina;
    }

    /**
     * sets stamina regen
     * @param stamina 0-staminaMax inclusive, will default to bounds if outside of these values.
     */
    void setStaminaRegen(double stamina){
        if(stamina>=0&&stamina<=staminaMax){
            staminaRegen = stamina;
        }else if(stamina<0){
            staminaRegen = 0;
        }else{
            staminaRegen = staminaMax;
        }
    }
    double getStaminaRegen(){
        return staminaRegen;
    }

    //magical-----------------------------------------------------------------------------------------------------------
    /**
     * sets magical damage
     * @param damage 0-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setDamageMagical(double damage){
        if(damage>=0&&damage<=Double.MAX_VALUE){
            damageMagical = damage;
        }else if(damage<0){
            damageMagical = 0;
        }else{
            damageMagical = Double.MAX_VALUE;
        }
    }
    double getDamageMagical(){
        return damageMagical;
    }

    /**
     * sets magical resistance
     * @param resistance Double.MIN_VALUE-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setResistanceMagical(double resistance){
        if(resistance>=Double.MIN_VALUE&&resistance<=Double.MAX_VALUE){
            resistanceMagical = resistance;
        }else if(resistance<Double.MIN_VALUE){
            resistanceMagical = Double.MIN_VALUE;
        }else{
            resistanceMagical = Double.MAX_VALUE;
        }
    }
    double getResistanceMagical(){
        return resistanceMagical;
    }

    /**
     * sets maximum mana
     * @param mana 0-Double.MAX_VALUE inclusive, will default to bounds if outside of these values.
     */
    void setManaMax(double mana){
        if(mana>=0&&mana<=Double.MAX_VALUE){
            manaMax = mana;
        }else if(mana<0){
            manaMax = 0;
        }else{
            manaMax= Double.MAX_VALUE;
        }
    }
    double getManaMax(){
        return manaMax;
    }

    /**
     * sets current mana
     * @param mana 0-manaMax inclusive, will default to bounds if outside of these values.
     */
    void setMana(double mana){
        if(mana>=0&&mana<=this.manaMax){
            this.mana = mana;
        }else if(mana<0){
            this.mana = 0;
        }else{
            this.mana = this.manaMax;
        }
    }
    double getMana(){
        return mana;
    }

    /**
     * sets mana regen
     * @param mana 0-manaMax inclusive, will default to bounds if outside of these values.
     */
    void setManaRegen(double mana){
        if(mana>=0&&mana<=manaMax){
            manaRegen = mana;
        }else if(mana<0){
            manaRegen = 0;
        }else{
            manaRegen = manaMax;
        }
    }
    double getManaRegen(){
        return manaRegen;
    }

    //initialization----------------------------------------------------------------------------------------------------
    Entity(String name, double health,
           double damagePhysical, double resistancePhysical, double stamina, double staminaRegen,
           double damageMagical, double resistanceMagical, double mana, double manaRegen){
        setName(name);
        setHealthMax(health);
        setHealth(health);

        setDamagePhysical(damagePhysical);
        setResistancePhysical(resistancePhysical);
        setStaminaMax(stamina);
        setStamina(stamina);
        setStaminaRegen(staminaRegen);

        setDamageMagical(damageMagical);
        setResistanceMagical(resistanceMagical);
        setManaMax(mana);
        setMana(mana);
        setManaRegen(manaRegen);
    }
}