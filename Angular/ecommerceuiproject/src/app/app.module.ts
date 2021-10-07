import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';
import { AddproductComponent } from './Product/addproduct/addproduct.component';
import { EditproductComponent } from './Product/editproduct/editproduct.component';
import { ViewproductComponent } from './Product/viewproduct/viewproduct.component';

@NgModule({
  declarations: [
    LoginmoduleComponent,
    AddproductComponent,
    EditproductComponent,
    ViewproductComponent
  ],
    
  
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
