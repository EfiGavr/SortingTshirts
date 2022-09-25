package com.mykiout.sortingassignment.sorting;

import com.mykiout.sortingassignment.model.TShirt;
import java.util.List;

public class QuickSort {

//-------------------QUICK SORT - SIZE-----------------------------    
    public void quickSortSizeAscending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            // This is the partitioning index, arr[p]
            // is now at right place 
            int partitionIndex = partitionAscending(tshirtsToSort, startingIndex, endingIndex);
            // Separately sort elements before
            // partition and after partition
            quickSortSizeAscending(tshirtsToSort, startingIndex, partitionIndex - 1);
            quickSortSizeAscending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    public void quickSortSizeDescending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionDescending(tshirtsToSort, startingIndex, endingIndex);
            quickSortSizeDescending(tshirtsToSort, startingIndex, partitionIndex - 1);
            quickSortSizeDescending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    private int partitionAscending(List<TShirt> tshirtsToSort, int low, int high) {

        // pivot is the last element of the tshirt list
        TShirt pivot = tshirtsToSort.get(high);

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot......
            if (tshirtsToSort.get(j).getSize().ordinal() < pivot.getSize().ordinal()) {
                // .......Increment index of smaller element
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    private int partitionDescending(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);

        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (tshirtsToSort.get(j).getSize().ordinal() > pivot.getSize().ordinal()) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    //-------------------QUICK SORT - COLOR-----------------------------    
    public void quickSortColorAscending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionColorAscending(tshirtsToSort, startingIndex, endingIndex);
            quickSortColorAscending(tshirtsToSort, startingIndex, partitionIndex - 1);
            quickSortColorAscending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    public void quickSortColorDescending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionColorDescending(tshirtsToSort, startingIndex, endingIndex);
            quickSortColorDescending(tshirtsToSort, startingIndex, partitionIndex - 1);
            quickSortColorDescending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    private int partitionColorAscending(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);
        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (tshirtsToSort.get(j).getColor().ordinal() < pivot.getColor().ordinal()) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    private int partitionColorDescending(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);

        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (tshirtsToSort.get(j).getColor().ordinal() > pivot.getColor().ordinal()) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    //-------------------QUICK SORT - FABRIC-----------------------------    
    public void quickSortFabricAscending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionFabricAscending(tshirtsToSort, startingIndex, endingIndex);
            quickSortFabricAscending(tshirtsToSort, startingIndex, partitionIndex - 1);
            quickSortFabricAscending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    public void quickSortFabricDescending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionFabricDescending(tshirtsToSort, startingIndex, endingIndex);
            quickSortFabricDescending(tshirtsToSort, startingIndex, partitionIndex - 1);
            quickSortFabricDescending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }

    private int partitionFabricAscending(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);
        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (tshirtsToSort.get(j).getFabric().ordinal() < pivot.getFabric().ordinal()) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    private int partitionFabricDescending(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);

        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (tshirtsToSort.get(j).getFabric().ordinal() > pivot.getFabric().ordinal()) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    private void swap(List<TShirt> tshirtsToSort, int i, int j) {

        TShirt temp = tshirtsToSort.get(i);
        tshirtsToSort.set(i, tshirtsToSort.get(j));
        tshirtsToSort.set(j, temp);
    }

    public void quickSortAllAscending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionAscendingAll(tshirtsToSort, startingIndex, endingIndex);
            
            quickSortAllAscending(tshirtsToSort, startingIndex, partitionIndex - 1);
            
            quickSortAllAscending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }
     private int partitionAscendingAll(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);

        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (this.compareTshirts(tshirtsToSort.get(j), pivot)) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

    private boolean compareTshirts(TShirt tshirt1, TShirt tshshirt2) {

        boolean isSmaller = false;
        //check for size
        if (tshirt1.getSize().ordinal() < tshshirt2.getSize().ordinal()) {
            isSmaller = true;
        } else if (tshirt1.getSize().ordinal() == tshshirt2.getSize().ordinal()) {
            //check for color
            if (tshirt1.getColor().ordinal() < tshshirt2.getColor().ordinal()) {
                isSmaller = true;
            } else if (tshirt1.getColor().ordinal() == tshshirt2.getColor().ordinal()) {
                //check for fabric
                if (tshirt1.getFabric().ordinal() < tshshirt2.getFabric().ordinal()) {
                    isSmaller = true;
                }
            }
        }
        return isSmaller;
    }
    
    public void quickSortAllDescending(List<TShirt> tshirtsToSort, int startingIndex, int endingIndex) {

        if (startingIndex < endingIndex) {
            int partitionIndex = partitionDescendingAll(tshirtsToSort, startingIndex, endingIndex);
            
            quickSortAllDescending(tshirtsToSort, startingIndex, partitionIndex - 1);
            
            quickSortAllDescending(tshirtsToSort, partitionIndex + 1, endingIndex);
        }
    }
     private int partitionDescendingAll(List<TShirt> tshirtsToSort, int low, int high) {

        TShirt pivot = tshirtsToSort.get(high);

        int currentLowerNumberCounter = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (!this.compareTshirts(tshirtsToSort.get(j), pivot)) {
                currentLowerNumberCounter++;
                swap(tshirtsToSort, currentLowerNumberCounter, j);
            }
        }
        swap(tshirtsToSort, currentLowerNumberCounter + 1, high);
        return (currentLowerNumberCounter + 1);
    }

}
