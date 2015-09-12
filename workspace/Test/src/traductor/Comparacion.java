package traductor;
import java.util.ArrayList;

import com.leapmotion.leap.Bone;
import com.leapmotion.leap.Controller;
import com.leapmotion.leap.Finger;
import com.leapmotion.leap.Frame;
import com.leapmotion.leap.Gesture;
import com.leapmotion.leap.Hand;
import com.leapmotion.leap.Listener;
import com.leapmotion.leap.Tool;
import com.leapmotion.leap.Vector;
import com.leapmotion.leap.Bone.Type;
public class Comparacion {

	
	public String Manos(Frame frame){
		return frame.hands().toString()	;
	}
	
	
	public Finger finger(Frame frame,String fing){
		for(Finger dedo:frame.fingers()){
			String nombre=dedo.type().toString();
			if(nombre.equals(fing)){
				return dedo;
			}
		}
		return null;		
	}
	
	public String TipoMano(Frame frame){
		Hand mano=new Hand();	
		return  mano.isLeft() ? "es izquierda":"Es derecha";
	}
		
	public String A(Frame frame){
	//	System.out.println("hola");
		for(Hand mano:frame.hands()){			
			Vector direccion=mano.direction();
			//System.out.println(direccion.pitch()/*Math.toDegrees(direccion.pitch())*/+" "+direccion.yaw()/*Math.toDegrees(direccion.yaw())*/);
			if(Math.toDegrees(direccion.pitch())>50&&Math.toDegrees(direccion.pitch())<95){//palma
				//System.out.println(Math.toDegrees(direccion.pitch()));
				for(Finger dedos:frame.fingers()){
					for(Bone.Type boneType:Bone.Type.values()){
						Bone hueso=dedos.bone(Type.TYPE_DISTAL);
						Vector angulo=hueso.basis().getYBasis();
					//	System.out.println(Math.toDegrees(angulo.pitch()));
						if(Math.toDegrees(angulo.pitch())>-70&&Math.toDegrees(angulo.pitch())<50){
							//	System.out.println(Math.toDegrees(angulo.pitch()));
							Finger dedo=finger(frame,"TYPE_THUMB");							
							if(dedo!=null){
									//System.out.println(Math.toDegrees(angulo.pitch()));
								for(Bone.Type boneTypes:Bone.Type.values()){
									Bone huesos=dedo.bone(Type.TYPE_DISTAL);
									//System.out.println(tool.direction());
									Vector pulgar=huesos.basis().getXBasis();
									System.out.println(Math.toDegrees(angulo.pitch()));
									if(Math.toDegrees(pulgar.pitch())>80&&Math.toDegrees(pulgar.pitch())>160){
										System.out.println("Se detecto A");
										return "A";
									}
									
								}	
							}
						}
					}
				}
			}
			
		}
		return "a";
	}
	
	public String B(Frame frame){
	//	System.out.println("hola");
		for(Hand mano:frame.hands()){			
		Vector direccion=mano.direction();
		 //System.out.println(Math.toDegrees(direccion.pitch())+" "+Math.toDegrees(direccion.yaw()));
		if(Math.toDegrees(direccion.pitch())>50&&Math.toDegrees(direccion.pitch())<95){//palma
			//System.out.println(Math.toDegrees(direccion.pitch()));
			for(Finger dedos:frame.fingers()){
				for(Bone.Type boneType:Bone.Type.values()){
					Bone hueso=dedos.bone(Type.TYPE_DISTAL);
					Vector angulo=hueso.basis().getYBasis();
					//System.out.println(Math.toDegrees(angulo.pitch()));
					if(Math.toDegrees(angulo.pitch())>80&&Math.toDegrees(angulo.pitch())<170){
							//System.out.println(Math.toDegrees(angulo.pitch()));
						Finger dedo=finger(frame,"TYPE_THUMB");						
						if(dedo!=null){	
							//System.out.println(Math.toDegrees(angulo.pitch()));
						for(Bone.Type boneTypes:Bone.Type.values()){
							Bone huesos=dedo.bone(Type.TYPE_DISTAL);							
							Vector pulgar=huesos.basis().getXBasis();
							System.out.println(Math.toDegrees(angulo.yaw()));
							if(Math.toDegrees(pulgar.pitch())>80&&Math.toDegrees(pulgar.pitch())>160){
								System.out.println("B");
								return "B";
							}
							
						}	
						}
					}
				}		
			}
		}
	}
	return "a";
	}

	public String E(Frame frame){	System.out.println("hola");
	for(Hand mano:frame.hands()){			
	Vector direccion=mano.direction();
	 //System.out.println(Math.toDegrees(direccion.pitch())+" "+Math.toDegrees(direccion.yaw()));
	if(Math.toDegrees(direccion.pitch())>50&&Math.toDegrees(direccion.pitch())<95){//palma
		//System.out.println(Math.toDegrees(direccion.pitch()));
		for(Finger dedos:frame.fingers()){
			for(Bone.Type boneType:Bone.Type.values()){
				Bone hueso=dedos.bone(Type.TYPE_DISTAL);
				Vector angulo=hueso.basis().getYBasis();
				//System.out.println(Math.toDegrees(angulo.pitch()));
				if(Math.toDegrees(angulo.pitch())>80&&Math.toDegrees(angulo.pitch())<170){
						//System.out.println(Math.toDegrees(angulo.pitch()));
					Finger dedo=finger(frame,"TYPE_THUMB");						
					if(dedo!=null){	
						//System.out.println(Math.toDegrees(angulo.pitch()));
					for(Bone.Type boneTypes:Bone.Type.values()){
						Bone huesos=dedo.bone(Type.TYPE_DISTAL);							
						Vector pulgar=huesos.basis().getXBasis();
						System.out.println(Math.toDegrees(angulo.yaw()));
						if(Math.toDegrees(pulgar.pitch())>80&&Math.toDegrees(pulgar.pitch())>160){
							System.out.println("B");
							return "E";
						}
						
					}	
					}
				}
			}		
		}
	}
}
return "E";}

	public String I(Frame frame){	
		//System.out.println("adios");
		for(Hand mano:frame.hands()){
			Vector direccion=mano.direction();
			 //System.out.println(Math.toDegrees(direccion.pitch())+" "+Math.toDegrees(direccion.yaw()));
			if(Math.toDegrees(direccion.pitch())>50&&Math.toDegrees(direccion.pitch())<95){//palma
				//System.out.println(Math.toDegrees(direccion.pitch()));
				for(Finger dedos:frame.fingers()){
					for(Bone.Type boneType:Bone.Type.values()){
						Bone hueso=dedos.bone(Type.TYPE_DISTAL);
						Vector angulo=hueso.basis().getYBasis();
					//	System.out.println(Math.toDegrees(angulo.pitch()));
						if(Math.toDegrees(angulo.pitch())>-70&&Math.toDegrees(angulo.pitch())<50){
							//	System.out.println(Math.toDegrees(angulo.pitch()));
							Finger dedo=finger(frame,"TYPE_PINKY");							
							if(dedo!=null){
						//	System.out.println(Math.toDegrees(angulo.pitch()));
								for(Bone.Type boneTypes:Bone.Type.values()){
									Bone huesos=dedo.bone(Type.TYPE_DISTAL);
									//System.out.println(tool.direction());
									Vector pinky=huesos.basis().getXBasis();
									System.out.println(Math.toDegrees(pinky.pitch()));
									if(Math.toDegrees(pinky.pitch())<-30&&Math.toDegrees(pinky.pitch())>-80){
										//System.out.println("i");
										return "i";
									}								
								}	
							}
						}
					}
				}
			}
	}
	return "i";
}

	public boolean O(Frame frame){return false;}
	
	public boolean U(Frame frame){return false;}
	public ArrayList<String> getFunctions(Frame frame){
		ArrayList<String> funciones=new ArrayList<String>();
		funciones.add(new Comparacion().A(frame));
		funciones.add(new Comparacion().B(frame));
		funciones.add(new Comparacion().I(frame));

		return funciones;
	} 
}
