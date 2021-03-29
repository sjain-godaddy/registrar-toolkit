package neustar.registry.jtoolkit2.se.eps;

import neustar.registry.jtoolkit2.se.CheckCommand;
import neustar.registry.jtoolkit2.se.ExtendedObjectType;

/**
 * A DomainCheckCommand is used to check the availability of domain objects
 * in a Registry.  Instances of this class generate RFC5730 and RFC5731
 * compliant domain check EPP command service elements via the toXML method.
 *
 * @see EpsCheckResponse
 */
public class EpsCheckCommand extends CheckCommand {
    private static final long serialVersionUID = 3050267498759687925L;

    /**
     * Check the availability of the single identified block.
     *
     * @param name The name of the block to check the availability of.
     */
    public EpsCheckCommand(String name) {
        super(ExtendedObjectType.EPS, name);
    }

    /**
     * Check the availability of at least one block.
     *
     * @param names The names of the blocks to check the availability of.
     */
    public EpsCheckCommand(String[] names) {
        super(ExtendedObjectType.EPS, names);
    }
}

