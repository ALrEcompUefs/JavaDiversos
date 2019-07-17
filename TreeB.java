/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreD;

/**
 *
 * @author Alisson
 */
public class TreeB extends Tree{

    @Override
    protected boolean search(TreeNode r, int val) {
        if(r !=null){
            if(r.data == val){
                return true;
            }
            else{
                if(search(r.right,val))// se verdadeiro
                    return true;
                else{
                    if(search(r.left,val)){
                        return true;
                    }
                }     
            }
        }

        return false;
    }
    
}
