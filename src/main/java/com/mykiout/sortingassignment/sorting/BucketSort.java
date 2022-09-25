package com.mykiout.sortingassignment.sorting;

import com.mykiout.sortingassignment.model.TShirt;
import java.util.ArrayList;
import java.util.List;

public class BucketSort {

    //-----------------BUCKET SORT - SIZE--------------------
    /**
     *
     * @param tshirtsToSort
     * @param maxVal -> (SizeEnum.values().length)
     */
    public void bucketSortSizeAscending(List<TShirt> tshirtsToSort, int maxVal) {

        //Bucket is a List that contains more Lists for each size of Tshirts
        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        //Initializing one by one the arraylists of tshirts inside the 
        //bucket list
        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }
        //Take every TShirt of the List, find its ordinal
        //and depending on the ordinal, put the tshirt inside the bucket list
        //depending on the tshirt's size
        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                //Sorting the first list (tshirtsToSort) depending the size of the tshirts
                //which are allready sorted inside the bucket list
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortSizeDescending(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }
        int counter = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    //-----------------------BUCKET SORT - COLOR--------------------------
    public void bucketSortColorAscending(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }
        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getColor().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortColorDescending(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getColor().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }
        int counter = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

//    ------------------BUCKET SORT - FABRIC ----------------------
    public void bucketSortFabricAscending(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }
        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getFabric().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortFabricDescending(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getFabric().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }
        int counter = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }
    //-----------------BUCKET SORT - SIZE, COLOR, FABRIC--------------------

    public void bucketSortAllAscending(List<TShirt> tshirtsToSort, int maxVal) {

        this.bucketSortSizeAscendingCascade(tshirtsToSort, maxVal);

    }

    public void bucketSortSizeAscendingCascade(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }

        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            this.bucketSortColorAscendingCascade(bucket.get(i), maxVal);

            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortColorAscendingCascade(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }
        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getColor().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }
        int counter = 0;
        for (int i = 0; i < bucket.size(); i++) {
            this.bucketSortFabricAscending(bucket.get(i), maxVal);
            for (int j = 0; j < bucket.get(i).size(); j++) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortAllDescending(List<TShirt> tshirtsToSort, int maxVal) {

        this.bucketSortSizeDescendingCascade(tshirtsToSort, maxVal);

    }

    public void bucketSortSizeDescendingCascade(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getSize().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }
        int counter = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            this.bucketSortColorDescendingCascade(bucket.get(i), maxVal);

            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }

    public void bucketSortColorDescendingCascade(List<TShirt> tshirtsToSort, int maxVal) {

        List<List<TShirt>> bucket = new ArrayList<>(maxVal);

        for (int i = 0; i < maxVal; i++) {
            bucket.add(new ArrayList<TShirt>());
        }

        for (int i = 0; i < tshirtsToSort.size(); i++) {
            TShirt currentTshirt = tshirtsToSort.get(i);
            int currentOrdinal = currentTshirt.getColor().ordinal();
            bucket.get(currentOrdinal).add(currentTshirt);
        }
        int counter = 0;
        for (int i = bucket.size() - 1; i >= 0; i--) {
            this.bucketSortFabricDescending(bucket.get(i), maxVal);

            for (int j = bucket.get(i).size() - 1; j >= 0; j--) {
                tshirtsToSort.set(counter++, bucket.get(i).get(j));
            }
        }
    }
}
