package enums.aizat.math;

public enum Operation {
    Slojeniya{
        public int act (int x, int y){
            return (x + y);
        }
    },
    Vychitaniya{
        public int act (int x, int y){
            return (x - y);
        }
    },
    Umnojeniya{
        public int act (int x, int y){
            return (x * y);
        }
    };
    public abstract int act(int x, int y);
}
