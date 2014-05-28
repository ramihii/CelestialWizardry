// Date: 24.5.2014 20:46:30
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package celestialwizardry.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class WritingTableB extends ModelBase
{
  //fields
    ModelRenderer test;
  
  public WritingTableB()
  {
    textureWidth = 256;
    textureHeight = 32;
    
      test = new ModelRenderer(this, 0, 0);
      test.addBox(0F, 0F, 0F, 5, 5, 5);
      test.setRotationPoint(0F, 10F, 0F);
      test.setTextureSize(256, 32);
      test.mirror = true;
      setRotation(test, 0.7853982F, 0F, 0.6108652F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    test.render(f5);
  }
  
  public void render2(float f5) {
	  test.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

}