/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube.dl.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Mahmoud
 */
public class CompareStrings {
    
    private static String linkWatch = "http://www.youtube.com/watch?v";
    private static String linkList = "http://www.youtube.com/playlist?list";

    public static int compareYoutubeLink(String incomeString) {
        //if link of one vedio
        if (incomeString.regionMatches(true, 0, linkWatch, 0, linkWatch.length())) {
            String right = "This is a link of only vedio click to download it\n" + incomeString;
            int n=JOptionPane.showConfirmDialog(null, right,null,JOptionPane.YES_NO_OPTION);
            if(n==JOptionPane.YES_OPTION){
                return 1;
            }
            else if(n==JOptionPane.NO_OPTION){
                return 2;
            }
            
            
            
        }
        //if link of alist of vedio
        else if (incomeString.regionMatches(true, 0, linkList, 0, linkList.length())) {
            String right = "This is a link of List click to download it \n" + incomeString;
            int n=JOptionPane.showConfirmDialog(null, right,null,JOptionPane.YES_NO_OPTION);
               if(n==JOptionPane.YES_OPTION){
                return 3;
            }
            else if(n==JOptionPane.NO_OPTION){
                return 4;
            }
            
            
            
        }
        //if the link is false
        else {
            String show = "This is a not Right link please enter it again fo Example\n"
                    + "http://www.youtube.com/watch?v**" + "\n" + "http://www.youtube.com/playlist?list**";
            int n=JOptionPane.showConfirmDialog(null, show,null,JOptionPane.YES_NO_OPTION);
               if(n==JOptionPane.YES_OPTION){
                return 5;
            }
            else if(n==JOptionPane.NO_OPTION){
               return 6;
            }
            
            
            
        }
        return 0;
         
        } 
  }
        
    
