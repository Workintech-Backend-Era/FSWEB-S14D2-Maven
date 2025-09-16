package org.example;

import org.example.model.Bed;
import org.example.model.Bedroom;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;
import org.example.model.Carpet;
import org.example.model.Ceiling;
import org.example.model.Lamp;
import org.example.model.Wall;
import org.example.model.Wardrobe;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom = new Bedroom(new Wall("North"), new Wall("East"), new Wall("South"), new Wall("West"), new Ceiling(12, PaintColor.GREEN), new Carpet(10, 15, PaintColor.RED), new Bed("Modern", 4, 3, 2,2), new Lamp(LampType.NEON, true, 80), new Wardrobe(3, 2, 1), "Master Bedroom");
        
    }
}