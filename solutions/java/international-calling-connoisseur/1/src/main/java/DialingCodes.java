import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    Map<Integer,String> dialingCodes = new HashMap<>();
    Map<String,Integer> reverseDialingCodes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodes.put(code, country);
        this.reverseDialingCodes.put(country, code);
    }

    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (this.dialingCodes.containsKey(code)) {
        // code already in map → do nothing
        return;
        }
        if (this.dialingCodes.containsValue(country)) {
        // country already in map → do nothing
        return;
        }
        this.dialingCodes.put(code, country);
        this.reverseDialingCodes.put(country, code);
    }

    public Integer findDialingCode(String country) {
        if (this.dialingCodes.containsValue(country)) {
            return this.reverseDialingCodes.get(country);
        }
        else
        {
            return null;
        }
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
        
        if(oldCode != null)
        {
            this.dialingCodes.remove(oldCode);
        }
        this.dialingCodes.put(code, country);
        
    }
}
