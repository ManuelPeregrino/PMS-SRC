package com.petmaps.aplication.models;


import java.util.ArrayList;
public class RefugioData {
    public ArrayList<Refugio> refugios = new ArrayList<>();
    public ArrayList<UsuarioRefugio> Arrayrefugio;

    public void AgregarRefugios(){

        refugios.add(new Refugio("Centro de adopción El camino", "CAC EC1 2232", "Benito Juárez 369, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 60));
        refugios.add(new Refugio("Refugio de animales Huellitas ", "RFA HE1 1915", "Av. Quinta Sur Ote. 1558, Santa Cruz, 29019 Tuxtla Gutiérrez, Chis.", 120));
        refugios.add(new Refugio("Casa canina Palomares", "CCP RDC 1151", "Av Miguel Hidalgo 20, Bienestar Soc, 29077 Tuxtla Gutiérrez, Chis.", 30));
        refugios.add(new Refugio("Adopcion de gatos", "ADG TGZ 5543", "Fco. Sarabia 650, El Brasilito, 29040 Tuxtla Gutiérrez, Chis.", 45));
        refugios.add(new Refugio("Casa Huellitas", "CAH TGD 2415", "13a Pte. Nte. 319, Moctezuma, 29030, Tuxtla Gutiérrez, Chis", 35));
        refugios.add(new Refugio("Refugio comunitario de animales", "EE0 CDC 1292", "16a. Nte Ote, Albania Baja, 29010, Tuxtla Gutiérrez, Chis.", 80));
        refugios.add(new Refugio("Refugio de aves", "RFA CCH 1653", "5a. Nte. Pte 1553, Colonia Centro, 29038 Tuxtla Gutiérrez, Chis.", 25));
        refugios.add(new Refugio("Centro de Adopcion Canino Jimenez", "CAD CTG 7832", "Calle Segunda Ote. Sur 320, Francisco I. Madero, 29096, Tuxtla Gutiérrez, Chis.", 15));

    }

    public ArrayList<Refugio> mostrarRefugios() {
        return refugios;
    }
}
