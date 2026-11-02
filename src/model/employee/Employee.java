package model.employee;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Identifiable;
import model.SystemStatus;
import model.activity.*;

/**
 * Represents an employee in the system.
 * An employee has a system status and a list of activities they are associated
 * with.
 */
public class Employee implements Identifiable {

    private String id;
    private Role role;
    private SystemStatus status;
    private ArrayList<Activity> myActivities;

    /**
     * Constructs an Employee with the specified ID.
     *
     * @param role The role of the employee
     */
    public Employee(Role role) {
        id = generateId();
        this.role = role;
        status = SystemStatus.ACTIVE;
        myActivities = new ArrayList<Activity>();
    }

    /**
     * Sets the system status of the employee.
     *
     * @param status the new system status of the employee
     */
    public void setStatus(SystemStatus status) {
        this.status = status;
    }

    /**
     * Checks if the employee is active.
     *
     * @return {@code true} if the employee's status is ACTIVE, {@code false}
     *         otherwise
     */
    public boolean isActive() {
        if (status == SystemStatus.ACTIVE) {
            return true;
        }
        return false;
    }

    /**
     * Gets the unique identifier of the employee.
     *
     * @return the unique identifier of the employee
     */
    @Override
    public String getId() {
        return id;
    }

    /**
     * Generates a unique identifier based on the current date and time.
     *
     * @return A unique identifier as a String, generated using the current minute,
     *         second, and nanosecond.
     */
    @Override
    public String generateId() {
        return "E" + LocalDateTime.now().getMinute() + LocalDateTime.now().getSecond() + LocalDateTime.now().getNano();
    }

    /**
     * Gets the role of the employee.
     *
     * @return The role of the employee.
     */
    public Role getRole() {
        return role;
    }

    /**
     * Sets the role of the employee.
     *
     * @param role The new role to be assigned to the employee.
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Adds an activity to the employee's list of activities.
     *
     * @param myActivity the activity to be added
     * @return {@code true} if the activity was successfully added, {@code false}
     *         otherwise
     */
    public boolean addActivity(Activity myActivity) {

        // TODO: Pendiente validacion sobre el tipo de actividad

        return myActivities.add(myActivity);
    }

}
