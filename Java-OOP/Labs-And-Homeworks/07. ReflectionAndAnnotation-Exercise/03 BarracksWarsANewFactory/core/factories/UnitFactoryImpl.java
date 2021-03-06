package BarracksWarsANewFactory_3.core.factories;

import BarracksWarsANewFactory_3.interfaces.Unit;
import BarracksWarsANewFactory_3.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "BarracksWarsANewFactory_3.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class unitClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
        Constructor<Unit> constructor = unitClass.getConstructor();
        return constructor.newInstance();
    }
}
