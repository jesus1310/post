/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String grupo;

    /**
     * Constructor for objects of class JoinGroupPost
     */
    public JoinGroupPost(String author,String grupo)
    {
      super(author);
      this.grupo = grupo;
    }
    
    /**
     * Método que devuelve el grupo
     */
    public String getGrupo(){
        return grupo;
    }
}
