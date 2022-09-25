package com.mykiout.sortingassignment.syntheticdata;

import com.mykiout.sortingassignment.enums.ColorEnum;
import com.mykiout.sortingassignment.enums.FabricEnum;
import com.mykiout.sortingassignment.enums.SizeEnum;
import com.mykiout.sortingassignment.model.TShirt;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SyntheticDataCreator {

    public static List<TShirt> getRandomNumberOfTShirts(int numberOfTShirts) {

        List<TShirt> listToReturn = new ArrayList<>();
        Random random = new Random();
        ColorEnum[] colors = ColorEnum.values();
        SizeEnum[] sizes = SizeEnum.values();
        FabricEnum[] fabrics = FabricEnum.values();

        for (int i = 0; i < numberOfTShirts; i++) {
            int length = ColorEnum.values().length;
            int randomNumber = random.nextInt(length);
            ColorEnum randomColor = colors[randomNumber];

            //Better way to write the previous code :
            //randomColor = colors[random.nextInt(colors.length)];
            SizeEnum randomSize = sizes[random.nextInt(sizes.length)];
            FabricEnum randomFabric = fabrics[random.nextInt(fabrics.length)];

            TShirt Tshirt = new TShirt(randomColor, randomSize, randomFabric);
            listToReturn.add(Tshirt);
        }

        return listToReturn;
    }

}
