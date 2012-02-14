package asgard.weapon;

/**
 * 
 * @author Benjamin
 * 
 *         Condition codes used for messages. All codes have the format
 *         <type>_<action> where type (either M, V or C) is the class
 *         type that initiates the message
 */

public interface ConditionCodes {
	public final int V_DO_NOTHING = -1;
	
	public final int V_SAVE_TIMETABLE = 0;	
	public final int V_LOAD_TIMETABLE = 1;
	public final int V_DELETE_TIMETABLE = 2;
	public final int V_CREATE_TIMETABLE = 3;
	public final int V_MODIFY_TIMETABLE = 4;
	public final int V_DISPLAY_TIMETABLE = 5;
	
	public final int V_CLOSE_NEW_TIMETABLE = 12;
	public final int V_TEST_NULL = 13;
	
	public final int V_LAUNCH_CREATION_ACTIVITY = 20;
	
	public final int C_TIMETABLE_SAVING = 100;
	public final int C_TIMETABLE_SAVED = 101;
	public final int C_TIMETABLE_NOT_SAVED = 102;
	
	public final int C_TIMETABLE_LOADING = 103;
	public final int C_TIMETABLE_LOADED = 104;
	public final int C_TIMETABLE_NOT_LOADED = 105;
	
	public final int C_TIMETABLE_DISPLAYED = 111;
	
	public final int C_TIMETABLE_CREATED = 106;
	
	public final int C_TIMETABLE_CLOSED = 107;
	
	public final int C_GET_ACTIVITY = 108;

	public final int C_TEST_NULL = 109;
	
	public final int C_TIMETABLE_DELETED = 110;
}
