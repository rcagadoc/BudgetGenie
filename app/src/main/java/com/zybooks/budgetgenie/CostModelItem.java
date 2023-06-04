package com.zybooks.budgetgenie;

import java.util.UUID;

public class CostModelItem {

    private UUID id;
    private String ItemName;
    private String ItemNameHint;

    private int Units;
    private String UnitsHint;
    private float CostPerUnit;

    public UUID getId() {
        return id;
    }

    public String getItemName(){
        return ItemName;
    }

}
