package com.zybooks.budgetgenie;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CostModelDb {

    private static CostModelDb costModelDb;
    private List<CostModelItem> items;


    private CostModelDb(Context context){
        items = new ArrayList<>();
        Resources res = context.getResources();
    }


    private static CostModelDb getInstance(Context context){
        if(costModelDb == null){
            costModelDb = new CostModelDb(context);
        }
        return costModelDb;
    }


    public List<CostModelItem> getItems(){
        return items;
    }

    public CostModelItem getItem(UUID itemId){
        for(CostModelItem item : items){
            if(item.getId() == itemId){
                return item;
            }
        }
        return null;
    }

}
