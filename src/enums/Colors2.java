package enums;

public enum Colors2 {
    GREEN {
        public void printText() {
            System.out.println("print green text");
        }
    },
    BLUE {
        public void printText() {
            System.out.println("print blue text");
        }
    },
    RED {
        public void printText() {
            System.out.println("print red text");
        }
    },
    BLACK {
        public void printText() {
            System.out.println("print black text");
        }
    };

    public abstract void printText();
    public void printTextForAllColors() {
        System.out.println("all colors");
    }
}
