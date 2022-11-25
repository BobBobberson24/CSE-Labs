class FSA {

    int state = 0;
    boolean active;

    FSA(int s) {
        if (s >= 0 && s <= 3) {
            state = s;
        }
        else {
            System.out.println("This is an invalid state. Starting at state 0");
        }
        active = true;
    }

    int goToNextState() {
        state++;
        return state;
    }

    boolean end() {
        if (state == 3) {
            return true;
        }
        else {
            return false;
        }
    }
    int showCurrentState() {
        return state;
    }
    boolean isActive() {
        return active;
    }

}

