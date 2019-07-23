package com.tavisca.workshops.pratham.rover;

public class Vector {
        private final int x;
        private final int y;
        private final char direction;

        public Vector(int x, int y, char direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public int x() {
            return x;
        }

        public int y() {
            return y;
        }

        public char direction() {
            return direction;
        }

        public Vector turnLeft() {
            char dir = '\0';
            switch (direction) {
                case 'N': dir = 'W'; break;
                case 'W': dir = 'S'; break;
                case 'S': dir = 'E'; break;
                case 'E': dir = 'N'; break;
            }
            return new Vector(x, y, dir);
        }
}
