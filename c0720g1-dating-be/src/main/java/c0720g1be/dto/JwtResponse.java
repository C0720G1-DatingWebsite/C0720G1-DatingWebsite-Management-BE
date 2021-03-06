package c0720g1be.dto;


import java.util.Map;

public class JwtResponse {

    private String jwtToken;

    private Integer id;
    private String username;
    private String avatar;
    private Boolean enable;
    private String fullName;
    private Map<Integer, String> roleList;

    public JwtResponse() {
    }

    public JwtResponse(String jwtToken, Integer id, String username, String avatar, Boolean enable, String fullName, Map<Integer, String> roleList) {
        this.jwtToken = jwtToken;
        this.id = id;
        this.username = username;
        this.avatar = avatar;
        this.enable = enable;
        this.fullName = fullName;
        this.roleList = roleList;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Map<Integer, String> getRoleList() {
        return roleList;
    }

    public void setRoleList(Map<Integer, String> roleList) {
        this.roleList = roleList;
    }
}
