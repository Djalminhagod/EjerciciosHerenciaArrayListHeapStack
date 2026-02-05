package ejercicio1;

import java.util.ArrayList;

public class torremagica {

        private ArrayList<mago> habitantes;

        public torremagica() {
            habitantes = new ArrayList<>();
        }

        public ArrayList<mago> getHabitantes() {
            return habitantes;
        }

        public void entrenarMagos() {
            for (mago m : habitantes) {
                m.lanzarhechizo();
            }
        }
    }

