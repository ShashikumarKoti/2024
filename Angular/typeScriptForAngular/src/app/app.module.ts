import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { UsdInrPipe } from './pipes/usd-inr.pipe';
import { TemplateDrivenFormComponent } from './template-driven-form/template-driven-form.component';
import { FormsModule} from '@angular/forms';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component'
import { ReactiveFormsModule} from '@angular/forms'

@NgModule({
  declarations: [
    AppComponent,
    UsdInrPipe,
    TemplateDrivenFormComponent,
    ReactiveFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
