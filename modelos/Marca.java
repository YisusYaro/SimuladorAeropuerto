package modelos;

public enum Marca {
        PRESIDENCIAL("0001", 200,"Presidencial",300),
        SUKHOI("0002",150,"SUKHOI",250),
        BOEING("0003",80,"Boeing F-18",260),
        SIKORSKY("0004",90,"Sikorsky",350),
        LOCKHEED("0005",110,"Lockheed",200);
        
        private final String id;
        private final int capacidad;
        private final String nombre;
        private final double velocidad;
        
        private Marca(String id, int capacidad, String nombre, double velocidad){
          this.id =  id;
          this.capacidad = capacidad;
          this.nombre = nombre;
          this.velocidad = velocidad;
            
        }

        public String getID(){
            return this.id;
        }

        public int getCapacidad(){
            return this.capacidad;
        }

        public String getNombre(){
            return this.nombre;
        }

        public double getVelocidad(){
            return this.velocidad;
        }
}
