package com.company.Lesson13InteratorComperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Store {


    private List<Commodity> listStore = new ArrayList<>();


    public void addCommodity(Commodity commodity) {       // ADD
        listStore.add(commodity);

    }
    public void removeFromStorage(int index) {   // REMOVED INDEX
        listStore.remove(index);
    }
        public void replaceInStorage(int index, Commodity newCommodity) {
            listStore.set(index, newCommodity);
        }


    public List<Commodity> getListStore() {
        return listStore;
    }


    public void setListStore(List<Commodity> listStore) {
        this.listStore = listStore;
    }


    public void sortByName() {           ///Sort By NAME;
        Collections.sort(listStore);


        }
    public void sortByLength() {           //SORT by Length
        listStore.sort(new SortByLength());

        //  Collections.sort(listStore,new SortByLength());
    }

    public void sortByWeight() {
        listStore.sort(new SortByWeight());    //SORT by Weight
    }

    public void sortByWidth() {              //SORT by Width
        listStore.sort(new SortByWidth());
    }


    }
