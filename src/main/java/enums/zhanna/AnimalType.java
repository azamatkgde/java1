package enums.zhanna;

public enum AnimalType {
    DOG {
        @Override
        public Animal create(String name) {
            return new Dog(name);
        }
    },
    CAT {
        @Override
        public Animal create(String name) {
            return new Cat(name);
        }
    };

    public abstract Animal create(String name);
}
