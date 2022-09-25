package com.mykiout.sortingassignment;

import com.mykiout.sortingassignment.enums.SizeEnum;
import com.mykiout.sortingassignment.model.TShirt;
import com.mykiout.sortingassignment.sorting.BubbleSort;
import com.mykiout.sortingassignment.sorting.BucketSort;
import com.mykiout.sortingassignment.sorting.QuickSort;
import com.mykiout.sortingassignment.syntheticdata.SyntheticDataCreator;
import java.util.List;
import java.util.Scanner;

public class MainMenu {

    public void bringMenu() {
        List<TShirt> randomTshirts = SyntheticDataCreator.getRandomNumberOfTShirts(40);

        //List of 40 random Tshirts
        System.out.println("List of 40 random Tshirts : \n\n");
        for (TShirt tshirt : randomTshirts) {
            System.out.println(tshirt);
        }
        // Main menu where the user selects
        int methodOfSorting;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nChoose the method of sorting you would like :"
                + " 1 for Bubble Sort,"
                + " 2 for Bucket Sort,"
                + " 3 for Quick Sort");
        methodOfSorting = sc.nextInt();
        while ((methodOfSorting != 1) && (methodOfSorting != 2) && (methodOfSorting != 3)) {
            System.out.println("Wrong input !!!"
                    + " Choose the method of sorting you would like :"
                    + " 1 for Bubble Sort,"
                    + " 2 for Bucket Sort,"
                    + " 3 for Quick Sort");
            methodOfSorting = sc.nextInt();
        }

        int typeOfSorting;
        System.out.println("Choose the type of sorting you would like :"
                + " 1 for ascending,"
                + " 2 for descending");
        typeOfSorting = sc.nextInt();
        while ((typeOfSorting != 1) && (typeOfSorting != 2)) {
            System.out.println("Wrong input !!!"
                    + " Choose the type of sorting you would like :"
                    + " 1 for ascending,"
                    + " 2 for descending");
            typeOfSorting = sc.nextInt();
        }

        int charOfSorting;
        System.out.println("Choose the characteristic of sorting you would like :"
                + " 1 for size,"
                + " 2 for color"
                + " 3 for fabric"
                + " 4 for size, color and fabric");
        charOfSorting = sc.nextInt();
        while ((charOfSorting != 1) && (charOfSorting != 2) && (charOfSorting != 3) && (charOfSorting != 4)) {
            System.out.println("Wrong input !!!"
                    + "Choose the characteristic of sorting you would like :"
                    + " 1 for size,"
                    + " 2 for color"
                    + " 3 for fabric"
                    + " 4 for size, color and fabric");
            charOfSorting = sc.nextInt();
        }

        if (methodOfSorting == 1) {
            BubbleSort bubbleSort = new BubbleSort();
            if (typeOfSorting == 1) {
                long startingTime;
                long endingTime;
                if (charOfSorting == 1) {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortSizeAscending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting ascending (size):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBubble sort ascending for size took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 2) {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortColorAscending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting ascending(color):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBubble sort ascending for color took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 3) {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortFabricAscending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting ascending(fabric):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBubble sort ascending for fabric took : " + (endingTime - startingTime) + "\n\n");

                } else {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortAllAscending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting ascending(size, color and fabric):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBubble sort ascending for size, color and fabric took : " + (endingTime - startingTime) + "\n\n");

                }
            } else if (typeOfSorting == 2) {
                long startingTime;
                long endingTime;
                if (charOfSorting == 1) {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortSizeDescending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting descending(size):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBucket sort descending for size took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 2) {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortColorDescending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting descending(color):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBucket sort descending for color took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 3) {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortFabricDescending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting descending(fabric):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBucket sort descending for fabric took : " + (endingTime - startingTime) + "\n\n");

                } else {
                    startingTime = System.currentTimeMillis();

                    bubbleSort.bubbleSortAllDescending(randomTshirts);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bubble sorting descending(size, color and fabric):\n\n");
                    for (TShirt tshirt : randomTshirts) {
                        System.out.println(tshirt);
                    }
                    System.out.println("\n\nBucket sort descending for size, color and fabric took : " + (endingTime - startingTime) + "\n\n");

                }
            }
        } else if (methodOfSorting == 2) {
            BucketSort bucketsort = new BucketSort();

            if (typeOfSorting == 1) {
                long startingTime;
                long endingTime;
                if (charOfSorting == 1) {
                    startingTime = System.currentTimeMillis();
                    bucketsort.bucketSortSizeAscending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting ascending (size): \n\n");
                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort ascending for size took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 2) {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortColorAscending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting ascending (color): \n\n");
                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort ascending for color took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 3) {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortFabricAscending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting ascending (fabric): \n\n");
                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort ascending for fabric took : " + (endingTime - startingTime) + "\n\n");

                } else {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortAllAscending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting ascending (size, color, fabric): \n\n");
                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort ascending for size, color, fabric took : " + (endingTime - startingTime) + "\n\n");

                }

            } else if (typeOfSorting == 2) {
                long startingTime;
                long endingTime;
                if (charOfSorting == 1) {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortSizeDescending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting descending (size): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort descending for size took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 2) {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortColorDescending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting descending (color): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort descending for color took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 3) {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortFabricDescending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting descending (fabric): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort descending for fabric took : " + (endingTime - startingTime) + "\n\n");

                } else {
                    startingTime = System.currentTimeMillis();

                    bucketsort.bucketSortAllDescending(randomTshirts, SizeEnum.values().length);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter bucket sorting descending (size, color, fabric): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nBucket sort descending for size, color, fabric took : " + (endingTime - startingTime) + "\n\n");

                }

            }
        } else {
            QuickSort quickSort = new QuickSort();
            if (typeOfSorting == 1) {
                long startingTime;
                long endingTime;
                if (charOfSorting == 1) {
                    startingTime = System.currentTimeMillis();
                    quickSort.quickSortSizeAscending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting ascending (size): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort ascending for size took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 2) {
                    startingTime = System.currentTimeMillis();

                    quickSort.quickSortColorAscending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting ascending (color): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort ascending for color took : " + (endingTime - startingTime) + "\n\n");

                } else if (charOfSorting == 3) {
                    startingTime = System.currentTimeMillis();

                    quickSort.quickSortFabricAscending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting ascending (fabric): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort ascending for fabric took : " + (endingTime - startingTime) + "\n\n");

                } else {
                    startingTime = System.currentTimeMillis();

                    quickSort.quickSortAllAscending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting ascending (size, color, fabric): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort ascending for size, color, fabric took : " + (endingTime - startingTime) + "\n\n");

                }
            } else if (typeOfSorting == 2) {
                long startingTime;
                long endingTime;
                if (charOfSorting == 1) {
                    startingTime = System.currentTimeMillis();
                    quickSort.quickSortSizeDescending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();
                    System.out.println("\n\nAfter quick sorting descending (size): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }

                    System.out.println("\n\nQuick sort descending for size took : " + (endingTime - startingTime) + "\n\n");
                } else if (charOfSorting == 2) {
                    startingTime = System.currentTimeMillis();
                    quickSort.quickSortColorDescending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting descending (color): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort descending for color took : " + (endingTime - startingTime) + "\n\n");
                } else if (charOfSorting == 3) {
                    startingTime = System.currentTimeMillis();

                    quickSort.quickSortFabricDescending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting descending (fabric): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort descending for fabric took : " + (endingTime - startingTime) + "\n\n");

                } else {
                    startingTime = System.currentTimeMillis();

                    quickSort.quickSortAllDescending(randomTshirts, 0, randomTshirts.size() - 1);
                    endingTime = System.currentTimeMillis();

                    System.out.println("\n\nAfter quick sorting descending (size, color, fabric): \n\n");

                    for (int i = 0; i < randomTshirts.size(); i++) {
                        System.out.println(randomTshirts.get(i));
                    }
                    System.out.println("\n\nQuick sort descending for size, color, fabric took : " + (endingTime - startingTime) + "\n\n");

                }
            }
        }
    }
}
