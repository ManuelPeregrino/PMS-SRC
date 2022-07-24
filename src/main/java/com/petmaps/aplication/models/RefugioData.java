package com.petmaps.aplication.models;

import java.util.ArrayList;
public class RefugioData {
    public ArrayList<Refugio> refugios = new ArrayList<>();
    public void AgregarRefugios(){

        refugios.add(new Refugio("Centro de adopción El camino", "CAC EC1 2232", "Benito Juárez 369, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 60));
        refugios.add(new Refugio("Refugio de animales Huellitas ", "RFA HE1 1915", "Av. Quinta Sur Ote. 1558, Santa Cruz, 29019 Tuxtla Gutiérrez, Chis.", 120));
        refugios.add(new Refugio("Casa canina Palomares", "CCP RDC 1151", "Av Miguel Hidalgo 20, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 30));
        refugios.add(new Refugio("Adopcion de gatos", "ADG TGZ 5543", "Fco. Sarabia 650, El Brasilito, 29040 Tuxtla Gutiérrez, Chis.", 45));
        refugios.add(new Refugio("Centro de adopción 5", "EF0 CDC 12232", "Benito Juárez 369, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 35));
        refugios.add(new Refugio("Centro de adopción 6", "EF0 CDC 12232", "Benito Juárez 369, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 80));
        refugios.add(new Refugio("Centro de adopción 7", "EF0 CDC 12232", "Benito Juárez 369, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 25));
        refugios.add(new Refugio("Centro de adopción 8", "EF0 CDC 12232", "Benito Juárez 369, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 15));

    }

    public ArrayList<Refugio> mostrarRefugios() {
        return refugios;
    }
}
