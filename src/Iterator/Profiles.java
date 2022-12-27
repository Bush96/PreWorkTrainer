package Iterator;

public class Profiles implements Collection {
    private String name;
    private String otherInfo[];

    public void setName(String name) {
        this.name = name;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public Profiles(String name, String[] otherInfo) {
        this.name = name;
        this.otherInfo = otherInfo;
    }


    @Override
    public Iterator getIterator() {
        return new InfoIterator();
    }

    private class InfoIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < otherInfo.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object objNext() {
            return otherInfo[index++];
        }
    }
}