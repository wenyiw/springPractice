package DI.Config;

import java.util.*;

public class ComplexDataTypeInjection {

    /* ------ List ------*/
    private List<String> list;

    public List<String> getList() {
        return list;
    }
    public void setList(List<String> list) {
        this.list = list;
    }

    /* ------ Set ------*/
    private Set<String> set;
    public void setSet(Set<String> set) {
        this.set = set;
    }
    public Set<String> getSet() {
        return set;
    }

    /* ------ Array -------*/
    private String[] array1;
    private String[][] array2;
    public void setArray1(String[] array1) {
        this.array1 = array1;
    }
    public String[] getArray1() {
        return array1;
    }
    public void setArray2(String[][] array2) {
        this.array2 = array2;
    }
    public String[][] getArray2() {
        return array2;
    }

    /* ------ Map ------*/
    private Map<String, String> map;
    public void setMap(Map<String, String> map) {
        this.map = map;
    }
    public Map<String, String> getMap() {
        return map;
    }

    /* ------ Properties ------*/
    private Properties property;
    public void setProperty(Properties property) {
        this.property = property;
    }
    public Properties getProperty() {
        return property;
    }
}
