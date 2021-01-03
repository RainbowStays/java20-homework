package world;

import framework.Constants;
import javafx.scene.image.Image;
import output.URL;

public class GreenBaby extends Entity { // 四娃实体类
	
	public GreenBaby(String name) {
		super(name);
		// 子类特殊设置
		setMobile(true);
//		setActive(true);
//		setAttackable(false);
//		setDefendable(false);
//		
//		setWidth(Constants. PLAYER_DEFAULT_W);
//		setHeight(Constants. PLAYER_DEFAULT_H);
//		
//		setLifeValue(Constants.DEFAULT_LIFE_VALUE);
//		setMoveSpeed(Constants.DEFAULT_MOVE_SPEED);
//		setRunSpeed(Constants.DEFAULT_RUN_SPEED);
//		setJumpSpeed(Constants.DEFAULT_JUMP_SPEED);
//		setJumpHeight(Constants.DEFAULT_JUMP_HEIGHT);
//		
//		setAttackNearValue(Constants.DEFAULT_ATTACK_NEAR_VALUE);
//		setAttackNearDist(Constants.DEFAULT_ATTACK_NEAR_DIST);
//		setAttackNearSpeed(Constants.DEFAULT_ATTACK_NEAR_SPEED);
//		setAttackNearWidth(Constants.PLAYER_DEFAULT_ATTACK_W);
//		setAttackNearHeight(Constants.PLAYER_DEFAULT_ATTACK_H);
//		
//		setAttackFarValue(Constants.DEFAULT_ATTACK_FAR_VALUE);
//		setAttackFarDist(Constants.DEFAULT_ATTACK_FAR_DIST);
//		setAttackFarSpeed(Constants.DEFAULT_ATTACK_FAR_SPEED);
		setAttackFarWidth(Constants.PLAYER_DEFAULT_ATTACK_W + 50);
		setAttackFarHeight(Constants.PLAYER_DEFAULT_ATTACK_H + 5);
//		
//		setAttackKillValue(Constants.DEFAULT_ATTACK_KILL_VALUE);
//		setAttackKillDist(Constants.DEFAULT_ATTACK_KILL_DIST);
//		setAttackKillSpeed(Constants.DEFAULT_ATTACK_KILL_SPEED);
		setAttackKillWidth(Constants.PLAYER_DEFAULT_ATTACK_W + 50);
		setAttackKillHeight(Constants.PLAYER_DEFAULT_ATTACK_H);
//		
//		setDefendValue(Constants.DEFAULT_DEFEND_VALUE);
//		setDefendDist(Constants.DEFAULT_DEFEND_DIST);
//		setDefendSpeed(Constants.DEFAULT_DEFEND_SPEED);
//		setDefendWidth(Constants.PLAYER_DEFAULT_DEFEND_W);
		setDefendHeight(Constants.PLAYER_DEFAULT_DEFEND_H + 30);
		// 设置招式名称
		setAttackNearName(Constants.GREENBABY_ATTACKNEAR_NAME);
		setAttackFarName(Constants.GREENBABY_ATTACKFAR_NAME);
		setAttackKillName(Constants.GREENBABY_ATTACKKILL_NAME);
		setDefendName(Constants.GREENBABY_DEFEND_NAME);
	}
	
}
