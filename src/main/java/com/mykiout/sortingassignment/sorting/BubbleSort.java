package com.mykiout.sortingassignment.sorting;

import com.mykiout.sortingassignment.model.TShirt;
import java.util.List;

public class BubbleSort {

    //------------BUBBLE SORT - SIZE------------------------
    
    public void bubbleSortSizeAscending(List<TShirt> tshirtsToSortList) {
        
        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getSize().ordinal() > tshirtsToSortList.get(j + 1).getSize().ordinal()) {
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }
    public void bubbleSortSizeDescending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getSize().ordinal() < tshirtsToSortList.get(j + 1).getSize().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    //------------BUBBLE SORT - COLOR------------------------
    public void bubbleSortColorAscending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getColor().ordinal() > tshirtsToSortList.get(j + 1).getColor().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortColorDescending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
//                switch(sortingType){
//                }

                if (tshirtsToSortList.get(j).getColor().ordinal() < tshirtsToSortList.get(j + 1).getColor().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    //------------BUBBLE SORT - FABRIC------------------------
    public void bubbleSortFabricAscending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToSortList.get(j).getFabric().ordinal() > tshirtsToSortList.get(j + 1).getFabric().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    public void bubbleSortFabricDescending(List<TShirt> tshirtsToSortList) {

        int n = tshirtsToSortList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
//                switch(sortingType){
//                }

                if (tshirtsToSortList.get(j).getFabric().ordinal() < tshirtsToSortList.get(j + 1).getFabric().ordinal()) {
                    // swap arr[j+1] and arr[j]
                    TShirt temp = tshirtsToSortList.get(j);
                    tshirtsToSortList.set(j, tshirtsToSortList.get(j + 1));
                    tshirtsToSortList.set(j + 1, temp);
                }
            }
        }
    }

    //------------BUBBLE SORT - ALL------------------------
    public void bubbleSortAllAscending(List<TShirt> tshirtsToShort) {
        int n = tshirtsToShort.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToShort.get(j).getSize().ordinal() > tshirtsToShort.get(j + 1).getSize().ordinal()) {
                    TShirt temp = tshirtsToShort.get(j);
                    tshirtsToShort.set(j, tshirtsToShort.get(j + 1));
                    tshirtsToShort.set(j + 1, temp);
                } else if (tshirtsToShort.get(j).getSize().ordinal() == tshirtsToShort.get(j + 1).getSize().ordinal()) {
                    if (tshirtsToShort.get(j).getColor().ordinal() > tshirtsToShort.get(j + 1).getColor().ordinal()) {
                        TShirt temp = tshirtsToShort.get(j);
                        tshirtsToShort.set(j, tshirtsToShort.get(j + 1));
                        tshirtsToShort.set(j + 1, temp);
                    } else if (tshirtsToShort.get(j).getColor().ordinal() == tshirtsToShort.get(j + 1).getColor().ordinal()) {
                        if (tshirtsToShort.get(j).getFabric().ordinal() > tshirtsToShort.get(j + 1).getFabric().ordinal()) {
                            TShirt temp = tshirtsToShort.get(j);
                            tshirtsToShort.set(j, tshirtsToShort.get(j + 1));
                            tshirtsToShort.set(j + 1, temp);
                        }
                    }
                }
            }
        }
    }
    
        public void bubbleSortAllDescending(List<TShirt> tshirtsToShort) {
        int n = tshirtsToShort.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (tshirtsToShort.get(j).getSize().ordinal() < tshirtsToShort.get(j + 1).getSize().ordinal()) {
                    TShirt temp = tshirtsToShort.get(j);
                    tshirtsToShort.set(j, tshirtsToShort.get(j + 1));
                    tshirtsToShort.set(j + 1, temp);
                } else if (tshirtsToShort.get(j).getSize().ordinal() == tshirtsToShort.get(j + 1).getSize().ordinal()) {
                    if (tshirtsToShort.get(j).getColor().ordinal() < tshirtsToShort.get(j + 1).getColor().ordinal()) {
                        TShirt temp = tshirtsToShort.get(j);
                        tshirtsToShort.set(j, tshirtsToShort.get(j + 1));
                        tshirtsToShort.set(j + 1, temp);
                    } else if (tshirtsToShort.get(j).getColor().ordinal() == tshirtsToShort.get(j + 1).getColor().ordinal()) {
                        if (tshirtsToShort.get(j).getFabric().ordinal() < tshirtsToShort.get(j + 1).getFabric().ordinal()) {
                            TShirt temp = tshirtsToShort.get(j);
                            tshirtsToShort.set(j, tshirtsToShort.get(j + 1));
                            tshirtsToShort.set(j + 1, temp);
                        }
                    }
                }
            }
        }
    }
}