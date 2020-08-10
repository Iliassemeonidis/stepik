package abstr;


import java.util.Arrays;

public class AsciiCharSequence implements CharSequence{

        private   byte[] arrays;

        public AsciiCharSequence(byte[] bytes) {
           this.arrays = bytes.clone();
        }

        @Override
        public int length() {
            return arrays.length;
        }

        @Override
        public char charAt(int index) {
            return (char) arrays[index];
        }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {

        return new AsciiCharSequence(Arrays.copyOfRange(this.arrays,start, end ));

    }



    @Override
        public String toString() {
        return new String(arrays);
        }

    }

