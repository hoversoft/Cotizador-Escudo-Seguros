package com.agustinsoria.cotizadorescudoseguros;

import java.util.List;

/**
 * Created by Joel on 22/12/2016.
 */

class Category {
    String title;
    List<Type> type;
    float price;

    Category(String title, List<Type> type, float price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }
}