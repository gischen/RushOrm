package co.uk.friendlyapps.rushorm.TestObjects;

import java.util.List;

import co.uk.rushorm.core.RushObject;
import co.uk.rushorm.core.annotations.RushList;
import co.uk.rushorm.core.annotations.RushRenamed;

/**
 * Created by Stuart on 18/12/14.
 */
@RushRenamed(names = {"co.uk.friendlyapps.rushorm.TestObjects.TestBase1"})
public class TestUpgrade4 extends RushObject {
    @RushRenamed(names = {"stringField"})
    public String stringFieldNamed;
    @RushRenamed(names = {"doubleField"})
    public double doubleFieldNamed;
    @RushRenamed(names = {"intField"})
    public int intFieldNamed;
    @RushRenamed(names = {"longField"})
    public long longFieldNamed;
    @RushRenamed(names = {"shortField"})
    public short shortFieldNamed;
    @RushRenamed(names = {"booleanField"})
    public boolean booleanFieldNamed;
    @RushRenamed(names = {"testBase2"})
    public TestUpgrade5 testUpgrade5;
    @RushRenamed(names = {"testBase2List"})
    @RushList(classname = "co.uk.friendlyapps.rushorm.TestObjects.TestUpgrade5")
    public List<TestUpgrade5> testUpgrade5List;
}
