<?xml version="1.0" encoding="UTF-8" ?>

<Form version="1.9" maxVersion="1.9" type="org.netbeans.modules.form.forminfo.JFrameFormInfo">
  <Properties>
    <Property name="defaultCloseOperation" type="int" value="3"/>
  </Properties>
  <SyntheticProperties>
    <SyntheticProperty name="formSizePolicy" type="int" value="1"/>
    <SyntheticProperty name="generateCenter" type="boolean" value="false"/>
  </SyntheticProperties>
  <AuxValues>
    <AuxValue name="FormSettings_autoResourcing" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_autoSetComponentName" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_generateFQN" type="java.lang.Boolean" value="true"/>
    <AuxValue name="FormSettings_generateMnemonicsCode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_i18nAutoMode" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_layoutCodeTarget" type="java.lang.Integer" value="1"/>
    <AuxValue name="FormSettings_listenerGenerationStyle" type="java.lang.Integer" value="0"/>
    <AuxValue name="FormSettings_variablesLocal" type="java.lang.Boolean" value="false"/>
    <AuxValue name="FormSettings_variablesModifier" type="java.lang.Integer" value="2"/>
    <AuxValue name="designerSize" type="java.awt.Dimension" value="-84,-19,0,5,115,114,0,18,106,97,118,97,46,97,119,116,46,68,105,109,101,110,115,105,111,110,65,-114,-39,-41,-84,95,68,20,2,0,2,73,0,6,104,101,105,103,104,116,73,0,5,119,105,100,116,104,120,112,0,0,2,-68,0,0,4,29"/>
  </AuxValues>

  <Layout class="org.netbeans.modules.form.compat2.layouts.DesignBorderLayout"/>
  <SubComponents>
    <Container class="Modelo.FONDOADMIN" name="fONDOADMIN1">
      <Constraints>
        <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignBorderLayout" value="org.netbeans.modules.form.compat2.layouts.DesignBorderLayout$BorderConstraintsDescription">
          <BorderConstraints direction="First"/>
        </Constraint>
      </Constraints>

      <Layout class="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout">
        <Property name="useNullLayout" type="boolean" value="false"/>
      </Layout>
      <SubComponents>
        <Container class="javax.swing.JLayeredPane" name="ContenedorMenu">
          <Properties>
            <Property name="border" type="javax.swing.border.Border" editor="org.netbeans.modules.form.editors2.BorderEditor">
              <Border info="org.netbeans.modules.form.compat2.border.LineBorderInfo">
                <LineBorder/>
              </Border>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="10" y="0" width="-1" height="700"/>
            </Constraint>
          </Constraints>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="btnRegresar" pref="236" max="32767" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace pref="594" max="32767" attributes="0"/>
                      <Component id="btnRegresar" min="-2" pref="39" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="65" max="-2" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Component class="javax.swing.JButton" name="btnRegresar">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Tw Cen MT Condensed" size="24" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="66" green="33" red="0" type="rgb"/>
                </Property>
                <Property name="text" type="java.lang.String" value="Regresar"/>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JLayeredPane" name="ContenedorBarraSuperior">
          <Properties>
            <Property name="border" type="javax.swing.border.Border" editor="org.netbeans.modules.form.editors2.BorderEditor">
              <Border info="org.netbeans.modules.form.compat2.border.LineBorderInfo">
                <LineBorder/>
              </Border>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="286" y="0" width="760" height="50"/>
            </Constraint>
          </Constraints>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace min="-2" pref="237" max="-2" attributes="0"/>
                      <Component id="lblFecha" pref="355" max="32767" attributes="0"/>
                      <EmptySpace max="-2" attributes="0"/>
                      <Component id="lblCerrarSesion" min="-2" pref="137" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="23" max="-2" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace max="32767" attributes="0"/>
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="lblCerrarSesion" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="lblFecha" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="-2" pref="19" max="-2" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Component class="javax.swing.JLabel" name="lblCerrarSesion">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Tahoma" size="14" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
                <Property name="horizontalAlignment" type="int" value="0"/>
                <Property name="icon" type="javax.swing.Icon" editor="org.netbeans.modules.form.editors2.IconEditor">
                  <Image iconType="3" name="/IMG/iconcerrarsesionSMALL.png"/>
                </Property>
                <Property name="text" type="java.lang.String" value="Cerrar Sesi&#xf3;n"/>
                <Property name="cursor" type="java.awt.Cursor" editor="org.netbeans.modules.form.editors2.CursorEditor">
                  <Color id="Cursor de Mano"/>
                </Property>
                <Property name="horizontalTextPosition" type="int" value="2"/>
              </Properties>
              <Events>
                <EventHandler event="mouseClicked" listener="java.awt.event.MouseListener" parameters="java.awt.event.MouseEvent" handler="lblCerrarSesionMouseClicked"/>
              </Events>
            </Component>
            <Component class="javax.swing.JLabel" name="lblFecha">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Tahoma" size="14" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
                <Property name="text" type="java.lang.String" value="Fecha:"/>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JLayeredPane" name="ContenedorMesadeTrabajo">
          <Properties>
            <Property name="border" type="javax.swing.border.Border" editor="org.netbeans.modules.form.editors2.BorderEditor">
              <Border info="org.netbeans.modules.form.compat2.border.LineBorderInfo">
                <LineBorder/>
              </Border>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="286" y="52" width="-1" height="580"/>
            </Constraint>
          </Constraints>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace max="-2" attributes="0"/>
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Component id="lblRegistrarProducto" max="32767" attributes="0"/>
                          <Group type="102" attributes="0">
                              <Component id="ContenedorTabla" min="-2" max="-2" attributes="0"/>
                              <EmptySpace min="0" pref="10" max="32767" attributes="0"/>
                          </Group>
                      </Group>
                      <EmptySpace max="-2" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <EmptySpace min="-2" pref="18" max="-2" attributes="0"/>
                      <Component id="lblRegistrarProducto" min="-2" max="-2" attributes="0"/>
                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                      <Component id="ContenedorTabla" min="-2" max="-2" attributes="0"/>
                      <EmptySpace pref="15" max="32767" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Container class="javax.swing.JPanel" name="ContenedorTabla">
              <Properties>
                <Property name="border" type="javax.swing.border.Border" editor="org.netbeans.modules.form.editors2.BorderEditor">
                  <Border info="org.netbeans.modules.form.compat2.border.LineBorderInfo">
                    <LineBorder/>
                  </Border>
                </Property>
                <Property name="opaque" type="boolean" value="false"/>
              </Properties>

              <Layout>
                <DimensionLayout dim="0">
                  <Group type="103" groupAlignment="0" attributes="0">
                      <Group type="102" attributes="0">
                          <EmptySpace max="-2" attributes="0"/>
                          <Group type="103" groupAlignment="0" attributes="0">
                              <Component id="jScrollPane1" max="32767" attributes="0"/>
                              <Component id="jLayeredPane1" max="32767" attributes="0"/>
                          </Group>
                          <EmptySpace max="-2" attributes="0"/>
                      </Group>
                  </Group>
                </DimensionLayout>
                <DimensionLayout dim="1">
                  <Group type="103" groupAlignment="0" attributes="0">
                      <Group type="102" alignment="1" attributes="0">
                          <EmptySpace max="-2" attributes="0"/>
                          <Component id="jLayeredPane1" max="32767" attributes="0"/>
                          <EmptySpace type="separate" max="-2" attributes="0"/>
                          <Component id="jScrollPane1" min="-2" pref="355" max="-2" attributes="0"/>
                          <EmptySpace max="-2" attributes="0"/>
                      </Group>
                  </Group>
                </DimensionLayout>
              </Layout>
              <SubComponents>
                <Container class="javax.swing.JScrollPane" name="jScrollPane1">
                  <AuxValues>
                    <AuxValue name="autoScrollPane" type="java.lang.Boolean" value="true"/>
                  </AuxValues>

                  <Layout class="org.netbeans.modules.form.compat2.layouts.support.JScrollPaneSupportLayout"/>
                  <SubComponents>
                    <Component class="javax.swing.JTable" name="tbRegistrarProductos">
                      <Properties>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="model" type="javax.swing.table.TableModel" editor="org.netbeans.modules.form.editors2.TableModelEditor">
                          <Table columnCount="6" rowCount="0">
                            <Column editable="true" title="Id" type="java.lang.String"/>
                            <Column editable="true" title="Cantidad" type="java.lang.String"/>
                            <Column editable="true" title="Descripci&#xf3;n" type="java.lang.String"/>
                            <Column editable="true" title="Categoria" type="java.lang.String"/>
                            <Column editable="true" title="Nombre del Producto" type="java.lang.String"/>
                            <Column editable="true" title="Precio" type="java.lang.String"/>
                          </Table>
                        </Property>
                        <Property name="columnModel" type="javax.swing.table.TableColumnModel" editor="org.netbeans.modules.form.editors2.TableColumnModelEditor">
                          <TableColumnModel selectionModel="0">
                            <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                              <Title/>
                              <Editor/>
                              <Renderer/>
                            </Column>
                            <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                              <Title/>
                              <Editor/>
                              <Renderer/>
                            </Column>
                            <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                              <Title/>
                              <Editor/>
                              <Renderer/>
                            </Column>
                            <Column maxWidth="-1" minWidth="-1" prefWidth="-1" resizable="true">
                              <Title/>
                              <Editor/>
                              <Renderer/>
                            </Column>
                          </TableColumnModel>
                        </Property>
                        <Property name="gridColor" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="ff" green="ff" red="ff" type="rgb"/>
                        </Property>
                        <Property name="rowHeight" type="int" value="25"/>
                        <Property name="selectionBackground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="tableHeader" type="javax.swing.table.JTableHeader" editor="org.netbeans.modules.form.editors2.JTableHeaderEditor">
                          <TableHeader reorderingAllowed="true" resizingAllowed="true"/>
                        </Property>
                      </Properties>
                    </Component>
                  </SubComponents>
                </Container>
                <Container class="javax.swing.JLayeredPane" name="jLayeredPane1">

                  <Layout>
                    <DimensionLayout dim="0">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" attributes="0">
                              <EmptySpace max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="102" attributes="0">
                                      <Component id="lblCategoria" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                                      <Component id="cbCategoria" min="-2" pref="160" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" max="-2" attributes="0"/>
                                      <Component id="lblCantidad" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="6" max="-2" attributes="0"/>
                                      <Component id="txtCantidad" min="-2" pref="108" max="-2" attributes="0"/>
                                      <EmptySpace type="separate" max="-2" attributes="0"/>
                                      <Component id="lblPrecios" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace max="32767" attributes="0"/>
                                      <Component id="txtPrecios" min="-2" pref="75" max="-2" attributes="0"/>
                                      <EmptySpace min="-2" pref="29" max="-2" attributes="0"/>
                                      <Component id="btnRegistrar" min="-2" pref="92" max="-2" attributes="0"/>
                                  </Group>
                                  <Group type="102" attributes="0">
                                      <Component id="lblNombreProducto" min="-2" max="-2" attributes="0"/>
                                      <EmptySpace type="unrelated" max="-2" attributes="0"/>
                                      <Component id="txtNombre" min="-2" pref="168" max="-2" attributes="0"/>
                                      <EmptySpace type="separate" max="-2" attributes="0"/>
                                      <Component id="lblDescripcion" min="-2" pref="86" max="-2" attributes="0"/>
                                      <EmptySpace max="-2" attributes="0"/>
                                      <Component id="txtDesc" max="32767" attributes="0"/>
                                  </Group>
                              </Group>
                              <EmptySpace max="-2" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                    <DimensionLayout dim="1">
                      <Group type="103" groupAlignment="0" attributes="0">
                          <Group type="102" alignment="0" attributes="0">
                              <EmptySpace min="-2" pref="16" max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="1" attributes="0">
                                  <Group type="103" alignment="1" groupAlignment="0" attributes="0">
                                      <Group type="102" alignment="0" attributes="0">
                                          <EmptySpace min="-2" pref="11" max="-2" attributes="0"/>
                                          <Component id="lblNombreProducto" min="-2" max="-2" attributes="0"/>
                                      </Group>
                                      <Component id="txtNombre" min="-2" pref="31" max="-2" attributes="0"/>
                                      <Component id="txtDesc" min="-2" pref="31" max="-2" attributes="0"/>
                                  </Group>
                                  <Component id="lblDescripcion" min="-2" max="-2" attributes="0"/>
                              </Group>
                              <EmptySpace max="-2" attributes="0"/>
                              <Group type="103" groupAlignment="0" attributes="0">
                                  <Group type="103" groupAlignment="3" attributes="0">
                                      <Component id="cbCategoria" alignment="3" min="-2" pref="34" max="-2" attributes="0"/>
                                      <Component id="lblCategoria" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="txtCantidad" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="txtPrecios" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="lblCantidad" alignment="3" min="-2" max="-2" attributes="0"/>
                                      <Component id="lblPrecios" alignment="3" min="-2" max="-2" attributes="0"/>
                                  </Group>
                                  <Component id="btnRegistrar" alignment="0" max="32767" attributes="0"/>
                              </Group>
                              <EmptySpace max="-2" attributes="0"/>
                          </Group>
                      </Group>
                    </DimensionLayout>
                  </Layout>
                  <SubComponents>
                    <Component class="javax.swing.JLabel" name="lblNombreProducto">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Nombre del Producto:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="lblDescripcion">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Descripci&#xf3;n:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="lblCategoria">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Categoria:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JComboBox" name="cbCategoria">
                      <Properties>
                        <Property name="background" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="99" green="ff" red="99" type="rgb"/>
                        </Property>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tahoma" size="14" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="model" type="javax.swing.ComboBoxModel" editor="org.netbeans.modules.form.editors2.ComboBoxModelEditor">
                          <StringArray count="19">
                            <StringItem index="0" value="Refrescos"/>
                            <StringItem index="1" value="Lacteos"/>
                            <StringItem index="2" value="Embutidos"/>
                            <StringItem index="3" value="Consome"/>
                            <StringItem index="4" value="Crema de cacahuate"/>
                            <StringItem index="5" value="Alimento para bebe"/>
                            <StringItem index="6" value="Cereales"/>
                            <StringItem index="7" value="Especias"/>
                            <StringItem index="8" value="Harinas"/>
                            <StringItem index="9" value="Salsas"/>
                            <StringItem index="10" value="Sazonadores"/>
                            <StringItem index="11" value="Pastas"/>
                            <StringItem index="12" value="Enlatadas"/>
                            <StringItem index="13" value="Confiteria"/>
                            <StringItem index="14" value="Frutas y verduras"/>
                            <StringItem index="15" value="Bebidas"/>
                            <StringItem index="16" value="Carnes"/>
                            <StringItem index="17" value="Medicamentos"/>
                            <StringItem index="18" value="Higuiene"/>
                          </StringArray>
                        </Property>
                        <Property name="cursor" type="java.awt.Cursor" editor="org.netbeans.modules.form.editors2.CursorEditor">
                          <Color id="Cursor Por defecto"/>
                        </Property>
                        <Property name="focusCycleRoot" type="boolean" value="true"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="cbCategoriaActionPerformed"/>
                      </Events>
                      <AuxValues>
                        <AuxValue name="JavaCodeGenerator_TypeParameters" type="java.lang.String" value="&lt;String&gt;"/>
                      </AuxValues>
                    </Component>
                    <Component class="javax.swing.JButton" name="btnRegistrar">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Registrar"/>
                      </Properties>
                      <Events>
                        <EventHandler event="actionPerformed" listener="java.awt.event.ActionListener" parameters="java.awt.event.ActionEvent" handler="btnRegistrarActionPerformed"/>
                      </Events>
                    </Component>
                    <Component class="javax.swing.JLabel" name="lblCantidad">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Cantidad:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="txtCantidad">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="txtPrecios">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JLabel" name="lblPrecios">
                      <Properties>
                        <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                          <Font name="Tw Cen MT Condensed" size="18" style="1"/>
                        </Property>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                        <Property name="text" type="java.lang.String" value="Precio:"/>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="txtDesc">
                      <Properties>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                      </Properties>
                    </Component>
                    <Component class="javax.swing.JTextField" name="txtNombre">
                      <Properties>
                        <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                          <Color blue="66" green="33" red="0" type="rgb"/>
                        </Property>
                      </Properties>
                    </Component>
                  </SubComponents>
                </Container>
              </SubComponents>
            </Container>
            <Component class="javax.swing.JLabel" name="lblRegistrarProducto">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Tw Cen MT Condensed" size="36" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="66" green="33" red="0" type="rgb"/>
                </Property>
                <Property name="horizontalAlignment" type="int" value="0"/>
                <Property name="text" type="java.lang.String" value="REGISTRAR PRODUCTOS"/>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
        <Container class="javax.swing.JLayeredPane" name="ContenedorBarraSuperior1">
          <Properties>
            <Property name="border" type="javax.swing.border.Border" editor="org.netbeans.modules.form.editors2.BorderEditor">
              <Border info="org.netbeans.modules.form.compat2.border.LineBorderInfo">
                <LineBorder/>
              </Border>
            </Property>
          </Properties>
          <Constraints>
            <Constraint layoutClass="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout" value="org.netbeans.modules.form.compat2.layouts.DesignAbsoluteLayout$AbsoluteConstraintsDescription">
              <AbsoluteConstraints x="290" y="660" width="750" height="30"/>
            </Constraint>
          </Constraints>

          <Layout>
            <DimensionLayout dim="0">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="1" attributes="0">
                      <EmptySpace pref="527" max="32767" attributes="0"/>
                      <Component id="lblFecha1" min="-2" pref="72" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="56" max="-2" attributes="0"/>
                      <Component id="lblHora1" min="-2" pref="72" max="-2" attributes="0"/>
                      <EmptySpace min="-2" pref="21" max="-2" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
            <DimensionLayout dim="1">
              <Group type="103" groupAlignment="0" attributes="0">
                  <Group type="102" alignment="0" attributes="0">
                      <Group type="103" groupAlignment="3" attributes="0">
                          <Component id="lblHora1" alignment="3" min="-2" max="-2" attributes="0"/>
                          <Component id="lblFecha1" alignment="3" min="-2" max="-2" attributes="0"/>
                      </Group>
                      <EmptySpace min="0" pref="11" max="32767" attributes="0"/>
                  </Group>
              </Group>
            </DimensionLayout>
          </Layout>
          <SubComponents>
            <Component class="javax.swing.JLabel" name="lblHora1">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Tahoma" size="14" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
                <Property name="text" type="java.lang.String" value="Hora:"/>
              </Properties>
            </Component>
            <Component class="javax.swing.JLabel" name="lblFecha1">
              <Properties>
                <Property name="font" type="java.awt.Font" editor="org.netbeans.beaninfo.editors.FontEditor">
                  <Font name="Tahoma" size="14" style="1"/>
                </Property>
                <Property name="foreground" type="java.awt.Color" editor="org.netbeans.beaninfo.editors.ColorEditor">
                  <Color blue="ff" green="ff" red="ff" type="rgb"/>
                </Property>
                <Property name="text" type="java.lang.String" value="Fecha:"/>
              </Properties>
            </Component>
          </SubComponents>
        </Container>
      </SubComponents>
    </Container>
  </SubComponents>
</Form>
