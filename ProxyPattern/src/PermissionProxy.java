public class PermissionProxy implements AbstractPermission {
    private  RealPermission permission = new RealPermission();
    private  int level = 0;

    public void modifyUserInfo(){
        if (level==0){
            System.out.println("对不起，你没有该权限！");
        }
        else if(level==1){
            permission.modifyUserInfo();
        }
    }
    public void viewNote(){
        System.out.println("查看帖子！");
    }
    public void publishNote(){
        if (level==0){
            System.out.println("对不起，你没有该权限！");
        }
        else if(level==1){
            permission.publishNote();
        }
    }
    public void modifyNode(){
        if (level==0){
            System.out.println("对不起，你没有该权限！");
        }
        else if(level==1){
            permission.modifyNode();
        }
    }
    public void setLevel(int level){
        this.level = level;

    }
}
