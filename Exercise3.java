
    /*
    Write a method called isSorted that returns true if the list is in sorted (nondecreasing) order and returns false
otherwise. An empty list is considered to be sorted.
     */

    class Exercise3
    {
        public int data;
        public Exercise3 next;

        public Exercise3()
        {
            this(0, null);
        }

        public Exercise3(int data)
        {
            this(data, null);
        }

        public Exercise3(int data, Exercise3 next)
        {
            this.data = data;
            this.next = next;
        }
    }

    class LinkedIntList
    {
        private Exercise3 front;

        public LinkedIntList()
        {
            front = null;
        }

        public String toString()
        {
            if (front == null)
            {
                return "[]";
            } else
            {
                String result = "[" + front.data;
                Exercise3 current = front.next;

                while (current != null)
                {
                    result += ", " + current.data;
                    current = current.next;
                }
                result += "]";
                return result;
            }
        }

        public void add(int value)
        {
            if (front == null)
            {
                front = new Exercise3(value);

            } else
            {
                Exercise3 current = front;

                while (current.next != null)
                {
                    current = current.next;
                }
                current.next = new Exercise3(value);
            }
        }

        public int index(int value)
        {
            int index = 0;
            Exercise3 current = front;

            while (current != null)
            {
                if (current.data == value)
                {
                    return index;
                }
                index = index + 1;
                current = current.next;
            }
            System.out.println("Number: " + value + " cant be found");
            return -1;
        }

        public boolean sorted()
        {
            if (front == null)
            {
                return true;
            } else
            {
                Exercise3 sidste = front;
                Exercise3 current = front.next;
                while (current != null)
                {
                    if (sidste.data <= current.data)
                    {
                        sidste = current;
                        current = current.next;
                    } else
                    {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    class demo
    {
        public static void main(String[] args)
        {
            LinkedIntList liste1 = new LinkedIntList();
            liste1.add(18);
            liste1.add(27);
            liste1.add(68);
            liste1.add(73);
            liste1.add(88);
            liste1.add(93);

            if (liste1.sorted())
            {
                System.out.println("Sorteret!");
            } else
            {
                System.out.println("lort...");
            }
        }
    }

